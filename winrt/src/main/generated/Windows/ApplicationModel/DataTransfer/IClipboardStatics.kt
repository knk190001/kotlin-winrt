package Windows.ApplicationModel.DataTransfer

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
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

@ABIMarker(IClipboardStatics.ABI::class)
@Signature("{c627e291-34e2-4963-8eed-93cbb0ea3d70}")
@Guid("c627e29134e249638eed93cbb0ea3d70")
@WinRTInterface("c627e29134e249638eed93cbb0ea3d70")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IClipboardStatics.ByReference::class)
public interface IClipboardStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetContent(): DataPackageView?

  @InterfaceMethod(1)
  public fun SetContent(content: DataPackage?): Unit

  @InterfaceMethod(2)
  public fun Flush(): Unit

  @InterfaceMethod(3)
  public fun Clear(): Unit

  @InterfaceMethod(4)
  public fun add_ContentChanged(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_ContentChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IClipboardStatics> {
    public override fun getValue() = ABI.makeIClipboardStatics(pointer.getPointer(0))

    public fun setValue(value: IClipboardStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IClipboardStatics {
    public val __5510681_Ptr: Pointer?

    public val _5510681_VtblPtr: Pointer?
      get() = __5510681_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetContent(): DataPackageView? {
      val fnPtr = _5510681_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackageView>()
      val hr = fn.invokeHR(arrayOf(__5510681_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackageView>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SetContent(content: DataPackage?): Unit {
      val fnPtr = _5510681_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__5510681_Ptr, marshalToNative(content),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun Flush(): Unit {
      val fnPtr = _5510681_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__5510681_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun Clear(): Unit {
      val fnPtr = _5510681_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__5510681_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_ContentChanged(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _5510681_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__5510681_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_ContentChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _5510681_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__5510681_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IClipboardStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __5510681_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IClipboardStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c627e29134e249638eed93cbb0ea3d70")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIClipboardStatics(ptr: Pointer?): WithDefault = IClipboardStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IClipboardStatics {
      val address = segment.toRawLongValue()
      return makeIClipboardStatics(Pointer(address))
    }

    public override fun toNative(obj: IClipboardStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__5510681_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IClipboardStatics): Array<IClipboardStatics?> = (elements
        as Array<IClipboardStatics?>).castToImpl<IClipboardStatics,IClipboardStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IClipboardStatics?> =
        arrayOfNulls<IClipboardStatics_Impl>(size) as Array<IClipboardStatics?>
  }
}
