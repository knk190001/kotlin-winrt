package Windows.UI.Input.Spatial

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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpatialInteractionSource.ABI::class)
@Signature("{fb5433ba-b0b3-3148-9f3b-e9f5de568f5d}")
@Guid("fb5433bab0b331489f3be9f5de568f5d")
@WinRTInterface("fb5433bab0b331489f3be9f5de568f5d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialInteractionSource.ByReference::class)
public interface ISpatialInteractionSource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_Kind(): SpatialInteractionSourceKind?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialInteractionSource> {
    public override fun getValue() = ABI.makeISpatialInteractionSource(pointer.getPointer(0))

    public fun setValue(value: ISpatialInteractionSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialInteractionSource {
    public val __1168113215_Ptr: Pointer?

    public val _1168113215_VtblPtr: Pointer?
      get() = __1168113215_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): WinDef.UINT {
      val fnPtr = _1168113215_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1168113215_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Kind(): SpatialInteractionSourceKind? {
      val fnPtr = _1168113215_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialInteractionSourceKind>()
      val hr = fn.invokeHR(arrayOf(__1168113215_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialInteractionSourceKind>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialInteractionSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1168113215_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialInteractionSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fb5433bab0b331489f3be9f5de568f5d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialInteractionSource(ptr: Pointer?): WithDefault =
        ISpatialInteractionSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialInteractionSource {
      val address = segment.toRawLongValue()
      return makeISpatialInteractionSource(Pointer(address))
    }

    public override fun toNative(obj: ISpatialInteractionSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1168113215_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialInteractionSource):
        Array<ISpatialInteractionSource?> = (elements as
        Array<ISpatialInteractionSource?>).castToImpl<ISpatialInteractionSource,ISpatialInteractionSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialInteractionSource?> =
        arrayOfNulls<ISpatialInteractionSource_Impl>(size) as Array<ISpatialInteractionSource?>
  }
}
