package Windows.Web.Http

import Windows.Storage.Streams.IInputStream
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

@ABIMarker(IHttpStreamContentFactory.ABI::class)
@Signature("{f3e64d9d-f725-407e-942f-0eda189809f4}")
@Guid("f3e64d9df725407e942f0eda189809f4")
@WinRTInterface("f3e64d9df725407e942f0eda189809f4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpStreamContentFactory.ByReference::class)
public interface IHttpStreamContentFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromInputStream(content: IInputStream?): HttpStreamContent?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpStreamContentFactory> {
    public override fun getValue() = ABI.makeIHttpStreamContentFactory(pointer.getPointer(0))

    public fun setValue(value: IHttpStreamContentFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpStreamContentFactory {
    public val __1829391957_Ptr: Pointer?

    public val _1829391957_VtblPtr: Pointer?
      get() = __1829391957_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromInputStream(content: IInputStream?): HttpStreamContent? {
      val fnPtr = _1829391957_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpStreamContent>()
      val hr = fn.invokeHR(arrayOf(__1829391957_Ptr, marshalToNative(content), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpStreamContent>(result.getValue())
      return resultValue
    }
  }

  public class IHttpStreamContentFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1829391957_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpStreamContentFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f3e64d9df725407e942f0eda189809f4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpStreamContentFactory(ptr: Pointer?): WithDefault =
        IHttpStreamContentFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpStreamContentFactory {
      val address = segment.toRawLongValue()
      return makeIHttpStreamContentFactory(Pointer(address))
    }

    public override fun toNative(obj: IHttpStreamContentFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1829391957_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpStreamContentFactory):
        Array<IHttpStreamContentFactory?> = (elements as
        Array<IHttpStreamContentFactory?>).castToImpl<IHttpStreamContentFactory,IHttpStreamContentFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpStreamContentFactory?> =
        arrayOfNulls<IHttpStreamContentFactory_Impl>(size) as Array<IHttpStreamContentFactory?>
  }
}
