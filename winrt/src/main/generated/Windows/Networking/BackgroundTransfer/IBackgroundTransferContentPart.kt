package Windows.Networking.BackgroundTransfer

import Windows.Storage.IStorageFile
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBackgroundTransferContentPart.ABI::class)
@Signature("{e8e15657-d7d1-4ed8-838e-674ac217ace6}")
@Guid("e8e15657d7d14ed8838e674ac217ace6")
@WinRTInterface("e8e15657d7d14ed8838e674ac217ace6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundTransferContentPart.ByReference::class)
public interface IBackgroundTransferContentPart : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetHeader(headerName: String?, headerValue: String?): Unit

  @InterfaceMethod(1)
  public fun SetText(value: String?): Unit

  @InterfaceMethod(2)
  public fun SetFile(value: IStorageFile?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundTransferContentPart> {
    public override fun getValue() = ABI.makeIBackgroundTransferContentPart(pointer.getPointer(0))

    public fun setValue(value: IBackgroundTransferContentPart_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundTransferContentPart {
    public val __630085490_Ptr: Pointer?

    public val _630085490_VtblPtr: Pointer?
      get() = __630085490_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetHeader(headerName: String?, headerValue: String?): Unit {
      val fnPtr = _630085490_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__630085490_Ptr, marshalToNative(headerName),
          marshalToNative(headerValue),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun SetText(value: String?): Unit {
      val fnPtr = _630085490_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__630085490_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun SetFile(value: IStorageFile?): Unit {
      val fnPtr = _630085490_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__630085490_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBackgroundTransferContentPart_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __630085490_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundTransferContentPart, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e8e15657d7d14ed8838e674ac217ace6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundTransferContentPart(ptr: Pointer?): WithDefault =
        IBackgroundTransferContentPart_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundTransferContentPart {
      val address = segment.toRawLongValue()
      return makeIBackgroundTransferContentPart(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundTransferContentPart): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__630085490_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundTransferContentPart):
        Array<IBackgroundTransferContentPart?> = (elements as
        Array<IBackgroundTransferContentPart?>).castToImpl<IBackgroundTransferContentPart,IBackgroundTransferContentPart_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundTransferContentPart?> =
        arrayOfNulls<IBackgroundTransferContentPart_Impl>(size) as
        Array<IBackgroundTransferContentPart?>
  }
}
