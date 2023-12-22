package Windows.Web.Http

import Windows.Foundation.IAsyncOperationWithProgress
import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import Windows.Storage.Streams.IBuffer
import Windows.Storage.Streams.IInputStream
import Windows.Storage.Streams.IOutputStream
import Windows.Web.Http.Headers.HttpContentHeaderCollection
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHttpContent.ABI::class)
@Signature("{6b14a441-fba7-4bd2-af0a-839de7c295da}")
@Guid("6b14a441fba74bd2af0a839de7c295da")
@WinRTInterface("6b14a441fba74bd2af0a839de7c295da")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpContent.ByReference::class)
public interface IHttpContent : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun get_Headers(): HttpContentHeaderCollection?

  @InterfaceMethod(1)
  public fun BufferAllAsync(): IAsyncOperationWithProgress<WinDef.ULONG, WinDef.ULONG>?

  @InterfaceMethod(2)
  public fun ReadAsBufferAsync(): IAsyncOperationWithProgress<IBuffer?, WinDef.ULONG>?

  @InterfaceMethod(3)
  public fun ReadAsInputStreamAsync(): IAsyncOperationWithProgress<IInputStream?, WinDef.ULONG>?

  @InterfaceMethod(4)
  public fun ReadAsStringAsync(): IAsyncOperationWithProgress<String?, WinDef.ULONG>?

  @InterfaceMethod(5)
  public fun TryComputeLength(length: WinDef.ULONG): Boolean

  @InterfaceMethod(6)
  public fun WriteToStreamAsync(outputStream: IOutputStream?):
      IAsyncOperationWithProgress<WinDef.ULONG, WinDef.ULONG>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IHttpContent> {
    public override fun getValue() = ABI.makeIHttpContent(pointer.getPointer(0))

    public fun setValue(value: IHttpContent_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpContent, IClosable.WithDefault {
    public val __1335469675_Ptr: Pointer?

    public val _1335469675_VtblPtr: Pointer?
      get() = __1335469675_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Headers(): HttpContentHeaderCollection? {
      val fnPtr = _1335469675_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpContentHeaderCollection>()
      val hr = fn.invokeHR(arrayOf(__1335469675_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpContentHeaderCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun BufferAllAsync(): IAsyncOperationWithProgress<WinDef.ULONG, WinDef.ULONG>? {
      val fnPtr = _1335469675_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<WinDef.ULONG, WinDef.ULONG>>()
      val hr = fn.invokeHR(arrayOf(__1335469675_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<WinDef.ULONG,
          WinDef.ULONG>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ReadAsBufferAsync(): IAsyncOperationWithProgress<IBuffer?, WinDef.ULONG>? {
      val fnPtr = _1335469675_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<IBuffer?, WinDef.ULONG>>()
      val hr = fn.invokeHR(arrayOf(__1335469675_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<IBuffer?,
          WinDef.ULONG>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ReadAsInputStreamAsync(): IAsyncOperationWithProgress<IInputStream?,
        WinDef.ULONG>? {
      val fnPtr = _1335469675_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<IInputStream?, WinDef.ULONG>>()
      val hr = fn.invokeHR(arrayOf(__1335469675_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<IInputStream?,
          WinDef.ULONG>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun ReadAsStringAsync(): IAsyncOperationWithProgress<String?, WinDef.ULONG>? {
      val fnPtr = _1335469675_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<String?, WinDef.ULONG>>()
      val hr = fn.invokeHR(arrayOf(__1335469675_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<String?,
          WinDef.ULONG>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun TryComputeLength(length: WinDef.ULONG): Boolean {
      val fnPtr = _1335469675_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1335469675_Ptr, length, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun WriteToStreamAsync(outputStream: IOutputStream?):
        IAsyncOperationWithProgress<WinDef.ULONG, WinDef.ULONG>? {
      val fnPtr = _1335469675_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<WinDef.ULONG, WinDef.ULONG>>()
      val hr = fn.invokeHR(arrayOf(__1335469675_Ptr, marshalToNative(outputStream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<WinDef.ULONG,
          WinDef.ULONG>>(result.getValue())
      return resultValue
    }
  }

  public class IHttpContent_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1335469675_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1335469675_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpContent, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6b14a441fba74bd2af0a839de7c295da")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpContent(ptr: Pointer?): WithDefault = IHttpContent_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpContent {
      val address = segment.toRawLongValue()
      return makeIHttpContent(Pointer(address))
    }

    public override fun toNative(obj: IHttpContent): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1335469675_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpContent): Array<IHttpContent?> = (elements as
        Array<IHttpContent?>).castToImpl<IHttpContent,IHttpContent_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpContent?> =
        arrayOfNulls<IHttpContent_Impl>(size) as Array<IHttpContent?>
  }
}
