package Windows.Web.Http.Headers

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IHttpContentRangeHeaderValueFactory.ABI::class)
@Signature("{3f5bd691-a03c-4456-9a6f-ef27ecd03cae}")
@Guid("3f5bd691a03c44569a6fef27ecd03cae")
@WinRTInterface("3f5bd691a03c44569a6fef27ecd03cae")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpContentRangeHeaderValueFactory.ByReference::class)
public interface IHttpContentRangeHeaderValueFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromLength(length: WinDef.ULONG): HttpContentRangeHeaderValue?

  @InterfaceMethod(1)
  public fun CreateFromRange(from: WinDef.ULONG, to: WinDef.ULONG): HttpContentRangeHeaderValue?

  @InterfaceMethod(2)
  public fun CreateFromRangeWithLength(
    from: WinDef.ULONG,
    to: WinDef.ULONG,
    length: WinDef.ULONG
  ): HttpContentRangeHeaderValue?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpContentRangeHeaderValueFactory> {
    public override fun getValue() =
        ABI.makeIHttpContentRangeHeaderValueFactory(pointer.getPointer(0))

    public fun setValue(value: IHttpContentRangeHeaderValueFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpContentRangeHeaderValueFactory {
    public val __2125665578_Ptr: Pointer?

    public val _2125665578_VtblPtr: Pointer?
      get() = __2125665578_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromLength(length: WinDef.ULONG): HttpContentRangeHeaderValue? {
      val fnPtr = _2125665578_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpContentRangeHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__2125665578_Ptr, length, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpContentRangeHeaderValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromRange(from: WinDef.ULONG, to: WinDef.ULONG):
        HttpContentRangeHeaderValue? {
      val fnPtr = _2125665578_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpContentRangeHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__2125665578_Ptr, from, to, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpContentRangeHeaderValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateFromRangeWithLength(
      from: WinDef.ULONG,
      to: WinDef.ULONG,
      length: WinDef.ULONG
    ): HttpContentRangeHeaderValue? {
      val fnPtr = _2125665578_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpContentRangeHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__2125665578_Ptr, from, to, length, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpContentRangeHeaderValue>(result.getValue())
      return resultValue
    }
  }

  public class IHttpContentRangeHeaderValueFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2125665578_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpContentRangeHeaderValueFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3f5bd691a03c44569a6fef27ecd03cae")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpContentRangeHeaderValueFactory(ptr: Pointer?): WithDefault =
        IHttpContentRangeHeaderValueFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpContentRangeHeaderValueFactory {
      val address = segment.toRawLongValue()
      return makeIHttpContentRangeHeaderValueFactory(Pointer(address))
    }

    public override fun toNative(obj: IHttpContentRangeHeaderValueFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2125665578_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpContentRangeHeaderValueFactory):
        Array<IHttpContentRangeHeaderValueFactory?> = (elements as
        Array<IHttpContentRangeHeaderValueFactory?>).castToImpl<IHttpContentRangeHeaderValueFactory,IHttpContentRangeHeaderValueFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpContentRangeHeaderValueFactory?> =
        arrayOfNulls<IHttpContentRangeHeaderValueFactory_Impl>(size) as
        Array<IHttpContentRangeHeaderValueFactory?>
  }
}
