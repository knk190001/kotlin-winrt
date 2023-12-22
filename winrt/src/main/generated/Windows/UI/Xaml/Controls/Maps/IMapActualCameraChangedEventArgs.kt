package Windows.UI.Xaml.Controls.Maps

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMapActualCameraChangedEventArgs.ABI::class)
@Signature("{daa080da-b7f4-422c-a618-bbaa7c1d814c}")
@Guid("daa080dab7f4422ca618bbaa7c1d814c")
@WinRTInterface("daa080dab7f4422ca618bbaa7c1d814c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapActualCameraChangedEventArgs.ByReference::class)
public interface IMapActualCameraChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Camera(): MapCamera?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapActualCameraChangedEventArgs> {
    public override fun getValue() = ABI.makeIMapActualCameraChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMapActualCameraChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapActualCameraChangedEventArgs {
    public val __694466241_Ptr: Pointer?

    public val _694466241_VtblPtr: Pointer?
      get() = __694466241_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Camera(): MapCamera? {
      val fnPtr = _694466241_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapCamera>()
      val hr = fn.invokeHR(arrayOf(__694466241_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapCamera>(result.getValue())
      return resultValue
    }
  }

  public class IMapActualCameraChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __694466241_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapActualCameraChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("daa080dab7f4422ca618bbaa7c1d814c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapActualCameraChangedEventArgs(ptr: Pointer?): WithDefault =
        IMapActualCameraChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapActualCameraChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMapActualCameraChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMapActualCameraChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__694466241_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapActualCameraChangedEventArgs):
        Array<IMapActualCameraChangedEventArgs?> = (elements as
        Array<IMapActualCameraChangedEventArgs?>).castToImpl<IMapActualCameraChangedEventArgs,IMapActualCameraChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapActualCameraChangedEventArgs?> =
        arrayOfNulls<IMapActualCameraChangedEventArgs_Impl>(size) as
        Array<IMapActualCameraChangedEventArgs?>
  }
}
