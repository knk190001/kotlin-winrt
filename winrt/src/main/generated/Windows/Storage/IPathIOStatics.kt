package Windows.Storage

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVector
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IBuffer
import Windows.Storage.Streams.UnicodeEncoding
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
import kotlin.Byte
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPathIOStatics.ABI::class)
@Signature("{0f2f3758-8ec7-4381-922b-8f6c07d288f3}")
@Guid("0f2f37588ec74381922b8f6c07d288f3")
@WinRTInterface("0f2f37588ec74381922b8f6c07d288f3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPathIOStatics.ByReference::class)
public interface IPathIOStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ReadTextAsync(absolutePath: String?): IAsyncOperation<String?>?

  @InterfaceMethod(1)
  public fun ReadTextAsync(absolutePath: String?, encoding: UnicodeEncoding?):
      IAsyncOperation<String?>?

  @InterfaceMethod(2)
  public fun WriteTextAsync(absolutePath: String?, contents: String?): IAsyncAction?

  @InterfaceMethod(3)
  public fun WriteTextAsync(
    absolutePath: String?,
    contents: String?,
    encoding: UnicodeEncoding?
  ): IAsyncAction?

  @InterfaceMethod(4)
  public fun AppendTextAsync(absolutePath: String?, contents: String?): IAsyncAction?

  @InterfaceMethod(5)
  public fun AppendTextAsync(
    absolutePath: String?,
    contents: String?,
    encoding: UnicodeEncoding?
  ): IAsyncAction?

  @InterfaceMethod(6)
  public fun ReadLinesAsync(absolutePath: String?): IAsyncOperation<IVector<String?>?>?

  @InterfaceMethod(7)
  public fun ReadLinesAsync(absolutePath: String?, encoding: UnicodeEncoding?):
      IAsyncOperation<IVector<String?>?>?

  @InterfaceMethod(8)
  public fun WriteLinesAsync(absolutePath: String?, lines: IIterable<String?>?): IAsyncAction?

  @InterfaceMethod(9)
  public fun WriteLinesAsync(
    absolutePath: String?,
    lines: IIterable<String?>?,
    encoding: UnicodeEncoding?
  ): IAsyncAction?

  @InterfaceMethod(10)
  public fun AppendLinesAsync(absolutePath: String?, lines: IIterable<String?>?): IAsyncAction?

  @InterfaceMethod(11)
  public fun AppendLinesAsync(
    absolutePath: String?,
    lines: IIterable<String?>?,
    encoding: UnicodeEncoding?
  ): IAsyncAction?

  @InterfaceMethod(12)
  public fun ReadBufferAsync(absolutePath: String?): IAsyncOperation<IBuffer?>?

  @InterfaceMethod(13)
  public fun WriteBufferAsync(absolutePath: String?, buffer: IBuffer?): IAsyncAction?

  @InterfaceMethod(14)
  public fun WriteBytesAsync(absolutePath: String?, buffer: Array<Byte>): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPathIOStatics>
      {
    public override fun getValue() = ABI.makeIPathIOStatics(pointer.getPointer(0))

    public fun setValue(value: IPathIOStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPathIOStatics {
    public val __2132074817_Ptr: Pointer?

    public val _2132074817_VtblPtr: Pointer?
      get() = __2132074817_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ReadTextAsync(absolutePath: String?): IAsyncOperation<String?>? {
      val fnPtr = _2132074817_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__2132074817_Ptr, marshalToNative(absolutePath), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ReadTextAsync(absolutePath: String?, encoding: UnicodeEncoding?):
        IAsyncOperation<String?>? {
      val fnPtr = _2132074817_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__2132074817_Ptr, marshalToNative(absolutePath),
          marshalToNative(encoding), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun WriteTextAsync(absolutePath: String?, contents: String?): IAsyncAction? {
      val fnPtr = _2132074817_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__2132074817_Ptr, marshalToNative(absolutePath),
          marshalToNative(contents), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun WriteTextAsync(
      absolutePath: String?,
      contents: String?,
      encoding: UnicodeEncoding?
    ): IAsyncAction? {
      val fnPtr = _2132074817_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__2132074817_Ptr, marshalToNative(absolutePath),
          marshalToNative(contents), marshalToNative(encoding), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun AppendTextAsync(absolutePath: String?, contents: String?): IAsyncAction? {
      val fnPtr = _2132074817_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__2132074817_Ptr, marshalToNative(absolutePath),
          marshalToNative(contents), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun AppendTextAsync(
      absolutePath: String?,
      contents: String?,
      encoding: UnicodeEncoding?
    ): IAsyncAction? {
      val fnPtr = _2132074817_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__2132074817_Ptr, marshalToNative(absolutePath),
          marshalToNative(contents), marshalToNative(encoding), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun ReadLinesAsync(absolutePath: String?): IAsyncOperation<IVector<String?>?>? {
      val fnPtr = _2132074817_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVector<String?>?>>()
      val hr = fn.invokeHR(arrayOf(__2132074817_Ptr, marshalToNative(absolutePath), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IVector<String?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun ReadLinesAsync(absolutePath: String?, encoding: UnicodeEncoding?):
        IAsyncOperation<IVector<String?>?>? {
      val fnPtr = _2132074817_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVector<String?>?>>()
      val hr = fn.invokeHR(arrayOf(__2132074817_Ptr, marshalToNative(absolutePath),
          marshalToNative(encoding), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IVector<String?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun WriteLinesAsync(absolutePath: String?, lines: IIterable<String?>?):
        IAsyncAction? {
      val fnPtr = _2132074817_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__2132074817_Ptr, marshalToNative(absolutePath),
          marshalToNative(lines), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun WriteLinesAsync(
      absolutePath: String?,
      lines: IIterable<String?>?,
      encoding: UnicodeEncoding?
    ): IAsyncAction? {
      val fnPtr = _2132074817_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__2132074817_Ptr, marshalToNative(absolutePath),
          marshalToNative(lines), marshalToNative(encoding), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun AppendLinesAsync(absolutePath: String?, lines: IIterable<String?>?):
        IAsyncAction? {
      val fnPtr = _2132074817_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__2132074817_Ptr, marshalToNative(absolutePath),
          marshalToNative(lines), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun AppendLinesAsync(
      absolutePath: String?,
      lines: IIterable<String?>?,
      encoding: UnicodeEncoding?
    ): IAsyncAction? {
      val fnPtr = _2132074817_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__2132074817_Ptr, marshalToNative(absolutePath),
          marshalToNative(lines), marshalToNative(encoding), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun ReadBufferAsync(absolutePath: String?): IAsyncOperation<IBuffer?>? {
      val fnPtr = _2132074817_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IBuffer?>>()
      val hr = fn.invokeHR(arrayOf(__2132074817_Ptr, marshalToNative(absolutePath), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IBuffer?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun WriteBufferAsync(absolutePath: String?, buffer: IBuffer?): IAsyncAction? {
      val fnPtr = _2132074817_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__2132074817_Ptr, marshalToNative(absolutePath),
          marshalToNative(buffer), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun WriteBytesAsync(absolutePath: String?, buffer: Array<Byte>): IAsyncAction? {
      val fnPtr = _2132074817_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__2132074817_Ptr, marshalToNative(absolutePath),
          buffer.size,marshalToNative(buffer), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IPathIOStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2132074817_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPathIOStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0f2f37588ec74381922b8f6c07d288f3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPathIOStatics(ptr: Pointer?): WithDefault = IPathIOStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPathIOStatics {
      val address = segment.toRawLongValue()
      return makeIPathIOStatics(Pointer(address))
    }

    public override fun toNative(obj: IPathIOStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2132074817_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPathIOStatics): Array<IPathIOStatics?> = (elements as
        Array<IPathIOStatics?>).castToImpl<IPathIOStatics,IPathIOStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPathIOStatics?> =
        arrayOfNulls<IPathIOStatics_Impl>(size) as Array<IPathIOStatics?>
  }
}
