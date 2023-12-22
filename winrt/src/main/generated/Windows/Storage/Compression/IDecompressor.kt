package Windows.Storage.Compression

import Windows.Foundation.IClosable
import Windows.Storage.Streams.IInputStream
import Windows.Storage.Streams.IInputStream.ABI.IID
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

@ABIMarker(IDecompressor.ABI::class)
@Signature("{b883fe46-d68a-4c8b-ada0-4ee813fc5283}")
@Guid("b883fe46d68a4c8bada04ee813fc5283")
@WinRTInterface("b883fe46d68a4c8bada04ee813fc5283")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDecompressor.ByReference::class)
public interface IDecompressor : NativeMapped, IWinRTInterface, IInputStream, IClosable {
  @InterfaceMethod(0)
  public fun DetachStream(): IInputStream?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDecompressor>
      {
    public override fun getValue() = ABI.makeIDecompressor(pointer.getPointer(0))

    public fun setValue(value: IDecompressor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDecompressor, IInputStream.WithDefault, IClosable.WithDefault {
    public val __326163001_Ptr: Pointer?

    public val _326163001_VtblPtr: Pointer?
      get() = __326163001_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun DetachStream(): IInputStream? {
      val fnPtr = _326163001_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IInputStream>()
      val hr = fn.invokeHR(arrayOf(__326163001_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IInputStream>(result.getValue())
      return resultValue
    }
  }

  public class IDecompressor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IInputStream, IClosable {
    public override val __736491754_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_326163001_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IClosable.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_326163001_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __326163001_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDecompressor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b883fe46d68a4c8bada04ee813fc5283")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDecompressor(ptr: Pointer?): WithDefault = IDecompressor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDecompressor {
      val address = segment.toRawLongValue()
      return makeIDecompressor(Pointer(address))
    }

    public override fun toNative(obj: IDecompressor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__326163001_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDecompressor): Array<IDecompressor?> = (elements as
        Array<IDecompressor?>).castToImpl<IDecompressor,IDecompressor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDecompressor?> =
        arrayOfNulls<IDecompressor_Impl>(size) as Array<IDecompressor?>
  }
}
