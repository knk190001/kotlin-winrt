package Windows.UI.ViewManagement.Core

import Windows.Foundation.Rect
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

@ABIMarker(ICoreInputViewTransferringXYFocusEventArgs.ABI::class)
@Signature("{04de169f-ba02-4850-8b55-d82d03ba6d7f}")
@Guid("04de169fba0248508b55d82d03ba6d7f")
@WinRTInterface("04de169fba0248508b55d82d03ba6d7f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreInputViewTransferringXYFocusEventArgs.ByReference::class)
public interface ICoreInputViewTransferringXYFocusEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Origin(): Rect?

  @InterfaceMethod(1)
  public fun get_Direction(): CoreInputViewXYFocusTransferDirection?

  @InterfaceMethod(2)
  public fun put_TransferHandled(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun get_TransferHandled(): Boolean

  @InterfaceMethod(4)
  public fun put_KeepPrimaryViewVisible(value: Boolean): Unit

  @InterfaceMethod(5)
  public fun get_KeepPrimaryViewVisible(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreInputViewTransferringXYFocusEventArgs> {
    public override fun getValue() =
        ABI.makeICoreInputViewTransferringXYFocusEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreInputViewTransferringXYFocusEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreInputViewTransferringXYFocusEventArgs {
    public val __1856347704_Ptr: Pointer?

    public val _1856347704_VtblPtr: Pointer?
      get() = __1856347704_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Origin(): Rect? {
      val fnPtr = _1856347704_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__1856347704_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Direction(): CoreInputViewXYFocusTransferDirection? {
      val fnPtr = _1856347704_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreInputViewXYFocusTransferDirection>()
      val hr = fn.invokeHR(arrayOf(__1856347704_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreInputViewXYFocusTransferDirection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_TransferHandled(value: Boolean): Unit {
      val fnPtr = _1856347704_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1856347704_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_TransferHandled(): Boolean {
      val fnPtr = _1856347704_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1856347704_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_KeepPrimaryViewVisible(value: Boolean): Unit {
      val fnPtr = _1856347704_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1856347704_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_KeepPrimaryViewVisible(): Boolean {
      val fnPtr = _1856347704_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1856347704_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ICoreInputViewTransferringXYFocusEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1856347704_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreInputViewTransferringXYFocusEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("04de169fba0248508b55d82d03ba6d7f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreInputViewTransferringXYFocusEventArgs(ptr: Pointer?): WithDefault =
        ICoreInputViewTransferringXYFocusEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICoreInputViewTransferringXYFocusEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreInputViewTransferringXYFocusEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreInputViewTransferringXYFocusEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1856347704_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreInputViewTransferringXYFocusEventArgs):
        Array<ICoreInputViewTransferringXYFocusEventArgs?> = (elements as
        Array<ICoreInputViewTransferringXYFocusEventArgs?>).castToImpl<ICoreInputViewTransferringXYFocusEventArgs,ICoreInputViewTransferringXYFocusEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreInputViewTransferringXYFocusEventArgs?> =
        arrayOfNulls<ICoreInputViewTransferringXYFocusEventArgs_Impl>(size) as
        Array<ICoreInputViewTransferringXYFocusEventArgs?>
  }
}
