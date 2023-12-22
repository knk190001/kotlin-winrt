package Windows.UI.Xaml.Navigation

import Windows.UI.Xaml.Media.Animation.NavigationTransitionInfo
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(INavigatingCancelEventArgs2.ABI::class)
@Signature("{5407b704-8147-4343-838f-dd1ee908c137}")
@Guid("5407b70481474343838fdd1ee908c137")
@WinRTInterface("5407b70481474343838fdd1ee908c137")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigatingCancelEventArgs2.ByReference::class)
public interface INavigatingCancelEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Parameter(): IUnknown?

  @InterfaceMethod(1)
  public fun get_NavigationTransitionInfo(): NavigationTransitionInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigatingCancelEventArgs2> {
    public override fun getValue() = ABI.makeINavigatingCancelEventArgs2(pointer.getPointer(0))

    public fun setValue(value: INavigatingCancelEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigatingCancelEventArgs2 {
    public val __783011487_Ptr: Pointer?

    public val _783011487_VtblPtr: Pointer?
      get() = __783011487_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Parameter(): IUnknown? {
      val fnPtr = _783011487_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__783011487_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_NavigationTransitionInfo(): NavigationTransitionInfo? {
      val fnPtr = _783011487_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NavigationTransitionInfo>()
      val hr = fn.invokeHR(arrayOf(__783011487_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NavigationTransitionInfo>(result.getValue())
      return resultValue
    }
  }

  public class INavigatingCancelEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __783011487_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigatingCancelEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5407b70481474343838fdd1ee908c137")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigatingCancelEventArgs2(ptr: Pointer?): WithDefault =
        INavigatingCancelEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigatingCancelEventArgs2 {
      val address = segment.toRawLongValue()
      return makeINavigatingCancelEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: INavigatingCancelEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__783011487_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigatingCancelEventArgs2):
        Array<INavigatingCancelEventArgs2?> = (elements as
        Array<INavigatingCancelEventArgs2?>).castToImpl<INavigatingCancelEventArgs2,INavigatingCancelEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigatingCancelEventArgs2?> =
        arrayOfNulls<INavigatingCancelEventArgs2_Impl>(size) as Array<INavigatingCancelEventArgs2?>
  }
}
