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

@ABIMarker(IMapTargetCameraChangedEventArgs.ABI::class)
@Signature("{dbf00472-e953-4fa8-97d0-ea86359057cf}")
@Guid("dbf00472e9534fa897d0ea86359057cf")
@WinRTInterface("dbf00472e9534fa897d0ea86359057cf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapTargetCameraChangedEventArgs.ByReference::class)
public interface IMapTargetCameraChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Camera(): MapCamera?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapTargetCameraChangedEventArgs> {
    public override fun getValue() = ABI.makeIMapTargetCameraChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMapTargetCameraChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapTargetCameraChangedEventArgs {
    public val __1719514492_Ptr: Pointer?

    public val _1719514492_VtblPtr: Pointer?
      get() = __1719514492_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Camera(): MapCamera? {
      val fnPtr = _1719514492_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapCamera>()
      val hr = fn.invokeHR(arrayOf(__1719514492_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapCamera>(result.getValue())
      return resultValue
    }
  }

  public class IMapTargetCameraChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1719514492_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapTargetCameraChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dbf00472e9534fa897d0ea86359057cf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapTargetCameraChangedEventArgs(ptr: Pointer?): WithDefault =
        IMapTargetCameraChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapTargetCameraChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMapTargetCameraChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMapTargetCameraChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1719514492_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapTargetCameraChangedEventArgs):
        Array<IMapTargetCameraChangedEventArgs?> = (elements as
        Array<IMapTargetCameraChangedEventArgs?>).castToImpl<IMapTargetCameraChangedEventArgs,IMapTargetCameraChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapTargetCameraChangedEventArgs?> =
        arrayOfNulls<IMapTargetCameraChangedEventArgs_Impl>(size) as
        Array<IMapTargetCameraChangedEventArgs?>
  }
}
