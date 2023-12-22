package Windows.Perception.Spatial

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpatialAnchorExportSufficiency.ABI::class)
@Signature("{77c25b2b-3409-4088-b91b-fdfd05d1648f}")
@Guid("77c25b2b34094088b91bfdfd05d1648f")
@WinRTInterface("77c25b2b34094088b91bfdfd05d1648f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialAnchorExportSufficiency.ByReference::class)
public interface ISpatialAnchorExportSufficiency : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsMinimallySufficient(): Boolean

  @InterfaceMethod(1)
  public fun get_SufficiencyLevel(): Double

  @InterfaceMethod(2)
  public fun get_RecommendedSufficiencyLevel(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialAnchorExportSufficiency> {
    public override fun getValue() = ABI.makeISpatialAnchorExportSufficiency(pointer.getPointer(0))

    public fun setValue(value: ISpatialAnchorExportSufficiency_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialAnchorExportSufficiency {
    public val __479718562_Ptr: Pointer?

    public val _479718562_VtblPtr: Pointer?
      get() = __479718562_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsMinimallySufficient(): Boolean {
      val fnPtr = _479718562_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__479718562_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_SufficiencyLevel(): Double {
      val fnPtr = _479718562_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__479718562_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_RecommendedSufficiencyLevel(): Double {
      val fnPtr = _479718562_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__479718562_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class ISpatialAnchorExportSufficiency_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __479718562_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialAnchorExportSufficiency, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("77c25b2b34094088b91bfdfd05d1648f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialAnchorExportSufficiency(ptr: Pointer?): WithDefault =
        ISpatialAnchorExportSufficiency_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialAnchorExportSufficiency {
      val address = segment.toRawLongValue()
      return makeISpatialAnchorExportSufficiency(Pointer(address))
    }

    public override fun toNative(obj: ISpatialAnchorExportSufficiency): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__479718562_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialAnchorExportSufficiency):
        Array<ISpatialAnchorExportSufficiency?> = (elements as
        Array<ISpatialAnchorExportSufficiency?>).castToImpl<ISpatialAnchorExportSufficiency,ISpatialAnchorExportSufficiency_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialAnchorExportSufficiency?> =
        arrayOfNulls<ISpatialAnchorExportSufficiency_Impl>(size) as
        Array<ISpatialAnchorExportSufficiency?>
  }
}
