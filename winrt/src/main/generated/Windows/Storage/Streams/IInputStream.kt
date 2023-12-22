package Windows.Storage.Streams

import Windows.Foundation.IAsyncOperationWithProgress
import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInputStream.ABI::class)
@Signature("{905a0fe2-bc53-11df-8c49-001e4fc686da}")
@Guid("905a0fe2bc5311df8c49001e4fc686da")
@WinRTInterface("905a0fe2bc5311df8c49001e4fc686da")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputStream.ByReference::class)
public interface IInputStream : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun ReadAsync(
    buffer: IBuffer?,
    count: WinDef.UINT,
    options: InputStreamOptions?
  ): IAsyncOperationWithProgress<IBuffer?, WinDef.UINT>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IInputStream> {
    public override fun getValue() = ABI.makeIInputStream(pointer.getPointer(0))

    public fun setValue(value: IInputStream_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputStream, IClosable.WithDefault {
    public val __736491754_Ptr: Pointer?

    public val _736491754_VtblPtr: Pointer?
      get() = __736491754_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ReadAsync(
      buffer: IBuffer?,
      count: WinDef.UINT,
      options: InputStreamOptions?
    ): IAsyncOperationWithProgress<IBuffer?, WinDef.UINT>? {
      val fnPtr = _736491754_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<IBuffer?, WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__736491754_Ptr, marshalToNative(buffer), count,
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<IBuffer?,
          WinDef.UINT>>(result.getValue())
      return resultValue
    }
  }

  public class IInputStream_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_736491754_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __736491754_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputStream, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("905a0fe2bc5311df8c49001e4fc686da")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputStream(ptr: Pointer?): WithDefault = IInputStream_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputStream {
      val address = segment.toRawLongValue()
      return makeIInputStream(Pointer(address))
    }

    public override fun toNative(obj: IInputStream): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__736491754_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputStream): Array<IInputStream?> = (elements as
        Array<IInputStream?>).castToImpl<IInputStream,IInputStream_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputStream?> =
        arrayOfNulls<IInputStream_Impl>(size) as Array<IInputStream?>
  }
}
