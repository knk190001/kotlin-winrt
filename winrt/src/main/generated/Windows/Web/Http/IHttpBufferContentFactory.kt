package Windows.Web.Http

import Windows.Storage.Streams.IBuffer
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

@ABIMarker(IHttpBufferContentFactory.ABI::class)
@Signature("{bc20c193-c41f-4ff7-9123-6435736eadc2}")
@Guid("bc20c193c41f4ff791236435736eadc2")
@WinRTInterface("bc20c193c41f4ff791236435736eadc2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpBufferContentFactory.ByReference::class)
public interface IHttpBufferContentFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromBuffer(content: IBuffer?): HttpBufferContent?

  @InterfaceMethod(1)
  public fun CreateFromBufferWithOffset(
    content: IBuffer?,
    offset: WinDef.UINT,
    count: WinDef.UINT
  ): HttpBufferContent?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpBufferContentFactory> {
    public override fun getValue() = ABI.makeIHttpBufferContentFactory(pointer.getPointer(0))

    public fun setValue(value: IHttpBufferContentFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpBufferContentFactory {
    public val __978928405_Ptr: Pointer?

    public val _978928405_VtblPtr: Pointer?
      get() = __978928405_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromBuffer(content: IBuffer?): HttpBufferContent? {
      val fnPtr = _978928405_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpBufferContent>()
      val hr = fn.invokeHR(arrayOf(__978928405_Ptr, marshalToNative(content), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpBufferContent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromBufferWithOffset(
      content: IBuffer?,
      offset: WinDef.UINT,
      count: WinDef.UINT
    ): HttpBufferContent? {
      val fnPtr = _978928405_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpBufferContent>()
      val hr = fn.invokeHR(arrayOf(__978928405_Ptr, marshalToNative(content), offset, count,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpBufferContent>(result.getValue())
      return resultValue
    }
  }

  public class IHttpBufferContentFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __978928405_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpBufferContentFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bc20c193c41f4ff791236435736eadc2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpBufferContentFactory(ptr: Pointer?): WithDefault =
        IHttpBufferContentFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpBufferContentFactory {
      val address = segment.toRawLongValue()
      return makeIHttpBufferContentFactory(Pointer(address))
    }

    public override fun toNative(obj: IHttpBufferContentFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__978928405_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpBufferContentFactory):
        Array<IHttpBufferContentFactory?> = (elements as
        Array<IHttpBufferContentFactory?>).castToImpl<IHttpBufferContentFactory,IHttpBufferContentFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpBufferContentFactory?> =
        arrayOfNulls<IHttpBufferContentFactory_Impl>(size) as Array<IHttpBufferContentFactory?>
  }
}
