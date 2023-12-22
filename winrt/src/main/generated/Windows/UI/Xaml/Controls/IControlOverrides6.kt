package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Input.CharacterReceivedRoutedEventArgs
import Windows.UI.Xaml.Input.KeyRoutedEventArgs
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

@ABIMarker(IControlOverrides6.ABI::class)
@Signature("{e194c96a-d8cc-4339-a0e1-2e9c420879ec}")
@Guid("e194c96ad8cc4339a0e12e9c420879ec")
@WinRTInterface("e194c96ad8cc4339a0e12e9c420879ec")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IControlOverrides6.ByReference::class)
public interface IControlOverrides6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OnPreviewKeyDown(e: KeyRoutedEventArgs?): Unit

  @InterfaceMethod(1)
  public fun OnPreviewKeyUp(e: KeyRoutedEventArgs?): Unit

  @InterfaceMethod(2)
  public fun OnCharacterReceived(e: CharacterReceivedRoutedEventArgs?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IControlOverrides6> {
    public override fun getValue() = ABI.makeIControlOverrides6(pointer.getPointer(0))

    public fun setValue(value: IControlOverrides6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IControlOverrides6 {
    public val __1176319888_Ptr: Pointer?

    public val _1176319888_VtblPtr: Pointer?
      get() = __1176319888_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OnPreviewKeyDown(e: KeyRoutedEventArgs?): Unit {
      val fnPtr = _1176319888_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1176319888_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun OnPreviewKeyUp(e: KeyRoutedEventArgs?): Unit {
      val fnPtr = _1176319888_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1176319888_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun OnCharacterReceived(e: CharacterReceivedRoutedEventArgs?): Unit {
      val fnPtr = _1176319888_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1176319888_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IControlOverrides6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1176319888_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IControlOverrides6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e194c96ad8cc4339a0e12e9c420879ec")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIControlOverrides6(ptr: Pointer?): WithDefault = IControlOverrides6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IControlOverrides6 {
      val address = segment.toRawLongValue()
      return makeIControlOverrides6(Pointer(address))
    }

    public override fun toNative(obj: IControlOverrides6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1176319888_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IControlOverrides6): Array<IControlOverrides6?> =
        (elements as
        Array<IControlOverrides6?>).castToImpl<IControlOverrides6,IControlOverrides6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IControlOverrides6?> =
        arrayOfNulls<IControlOverrides6_Impl>(size) as Array<IControlOverrides6?>
  }
}
