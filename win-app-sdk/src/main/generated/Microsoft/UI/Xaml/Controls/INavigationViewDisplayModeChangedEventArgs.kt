package Microsoft.UI.Xaml.Controls

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

@ABIMarker(INavigationViewDisplayModeChangedEventArgs.ABI::class)
@Signature("{58dcf1ea-9e56-522c-b3f8-34bd55ecaca4}")
@Guid("58dcf1ea9e56522cb3f834bd55ecaca4")
@WinRTInterface("58dcf1ea9e56522cb3f834bd55ecaca4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewDisplayModeChangedEventArgs.ByReference::class)
public interface INavigationViewDisplayModeChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DisplayMode(): NavigationViewDisplayMode?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewDisplayModeChangedEventArgs> {
    public override fun getValue() =
        ABI.makeINavigationViewDisplayModeChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: INavigationViewDisplayModeChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewDisplayModeChangedEventArgs {
    public val __903186792_Ptr: Pointer?

    public val _903186792_VtblPtr: Pointer?
      get() = __903186792_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DisplayMode(): NavigationViewDisplayMode? {
      val fnPtr = _903186792_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NavigationViewDisplayMode>()
      val hr = fn.invokeHR(arrayOf(__903186792_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NavigationViewDisplayMode>(result.getValue())
      return resultValue
    }
  }

  public class INavigationViewDisplayModeChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __903186792_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewDisplayModeChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("58dcf1ea9e56522cb3f834bd55ecaca4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewDisplayModeChangedEventArgs(ptr: Pointer?): WithDefault =
        INavigationViewDisplayModeChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        INavigationViewDisplayModeChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeINavigationViewDisplayModeChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewDisplayModeChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__903186792_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewDisplayModeChangedEventArgs):
        Array<INavigationViewDisplayModeChangedEventArgs?> = (elements as
        Array<INavigationViewDisplayModeChangedEventArgs?>).castToImpl<INavigationViewDisplayModeChangedEventArgs,INavigationViewDisplayModeChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewDisplayModeChangedEventArgs?> =
        arrayOfNulls<INavigationViewDisplayModeChangedEventArgs_Impl>(size) as
        Array<INavigationViewDisplayModeChangedEventArgs?>
  }
}
