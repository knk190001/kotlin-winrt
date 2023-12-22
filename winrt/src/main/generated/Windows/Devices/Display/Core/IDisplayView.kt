package Windows.Devices.Display.Core

import Windows.Foundation.Collections.IMap
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IReference
import Windows.Graphics.SizeInt32
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

@ABIMarker(IDisplayView.ABI::class)
@Signature("{b0c98ca1-b759-5b59-b1ad-f0786aa9e53d}")
@Guid("b0c98ca1b7595b59b1adf0786aa9e53d")
@WinRTInterface("b0c98ca1b7595b59b1adf0786aa9e53d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayView.ByReference::class)
public interface IDisplayView : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Paths(): IVectorView<DisplayPath?>?

  @InterfaceMethod(1)
  public fun get_ContentResolution(): IReference<SizeInt32?>?

  @InterfaceMethod(2)
  public fun put_ContentResolution(value: IReference<SizeInt32?>?): Unit

  @InterfaceMethod(3)
  public fun SetPrimaryPath(path: DisplayPath?): Unit

  @InterfaceMethod(4)
  public fun get_Properties(): IMap<com.sun.jna.platform.win32.Guid.GUID?, IUnknown?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDisplayView> {
    public override fun getValue() = ABI.makeIDisplayView(pointer.getPointer(0))

    public fun setValue(value: IDisplayView_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayView {
    public val __619887163_Ptr: Pointer?

    public val _619887163_VtblPtr: Pointer?
      get() = __619887163_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Paths(): IVectorView<DisplayPath?>? {
      val fnPtr = _619887163_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<DisplayPath?>>()
      val hr = fn.invokeHR(arrayOf(__619887163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<DisplayPath?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ContentResolution(): IReference<SizeInt32?>? {
      val fnPtr = _619887163_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<SizeInt32?>>()
      val hr = fn.invokeHR(arrayOf(__619887163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<SizeInt32?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_ContentResolution(value: IReference<SizeInt32?>?): Unit {
      val fnPtr = _619887163_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__619887163_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun SetPrimaryPath(path: DisplayPath?): Unit {
      val fnPtr = _619887163_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__619887163_Ptr, marshalToNative(path),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Properties(): IMap<com.sun.jna.platform.win32.Guid.GUID?, IUnknown?>? {
      val fnPtr = _619887163_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMap<com.sun.jna.platform.win32.Guid.GUID?, IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__619887163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMap<com.sun.jna.platform.win32.Guid.GUID?,
          IUnknown?>>(result.getValue())
      return resultValue
    }
  }

  public class IDisplayView_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __619887163_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayView, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b0c98ca1b7595b59b1adf0786aa9e53d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayView(ptr: Pointer?): WithDefault = IDisplayView_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayView {
      val address = segment.toRawLongValue()
      return makeIDisplayView(Pointer(address))
    }

    public override fun toNative(obj: IDisplayView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__619887163_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayView): Array<IDisplayView?> = (elements as
        Array<IDisplayView?>).castToImpl<IDisplayView,IDisplayView_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayView?> =
        arrayOfNulls<IDisplayView_Impl>(size) as Array<IDisplayView?>
  }
}
