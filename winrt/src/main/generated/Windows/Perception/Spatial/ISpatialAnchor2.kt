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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpatialAnchor2.ABI::class)
@Signature("{ed17c908-a695-4cf6-92fd-97263ba71047}")
@Guid("ed17c908a6954cf692fd97263ba71047")
@WinRTInterface("ed17c908a6954cf692fd97263ba71047")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialAnchor2.ByReference::class)
public interface ISpatialAnchor2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RemovedByUser(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialAnchor2> {
    public override fun getValue() = ABI.makeISpatialAnchor2(pointer.getPointer(0))

    public fun setValue(value: ISpatialAnchor2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialAnchor2 {
    public val __17014844_Ptr: Pointer?

    public val _17014844_VtblPtr: Pointer?
      get() = __17014844_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RemovedByUser(): Boolean {
      val fnPtr = _17014844_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__17014844_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ISpatialAnchor2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __17014844_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialAnchor2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ed17c908a6954cf692fd97263ba71047")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialAnchor2(ptr: Pointer?): WithDefault = ISpatialAnchor2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialAnchor2 {
      val address = segment.toRawLongValue()
      return makeISpatialAnchor2(Pointer(address))
    }

    public override fun toNative(obj: ISpatialAnchor2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__17014844_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialAnchor2): Array<ISpatialAnchor2?> = (elements as
        Array<ISpatialAnchor2?>).castToImpl<ISpatialAnchor2,ISpatialAnchor2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialAnchor2?> =
        arrayOfNulls<ISpatialAnchor2_Impl>(size) as Array<ISpatialAnchor2?>
  }
}
