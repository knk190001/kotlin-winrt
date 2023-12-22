package Windows.Storage.Streams

import Windows.Foundation.Uri
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRandomAccessStreamReferenceStatics.ABI::class)
@Signature("{857309dc-3fbf-4e7d-986f-ef3b1a07a964}")
@Guid("857309dc3fbf4e7d986fef3b1a07a964")
@WinRTInterface("857309dc3fbf4e7d986fef3b1a07a964")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRandomAccessStreamReferenceStatics.ByReference::class)
public interface IRandomAccessStreamReferenceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromFile(`file`: IStorageFile?): RandomAccessStreamReference?

  @InterfaceMethod(1)
  public fun CreateFromUri(uri: Uri?): RandomAccessStreamReference?

  @InterfaceMethod(2)
  public fun CreateFromStream(stream: IRandomAccessStream?): RandomAccessStreamReference?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRandomAccessStreamReferenceStatics> {
    public override fun getValue() =
        ABI.makeIRandomAccessStreamReferenceStatics(pointer.getPointer(0))

    public fun setValue(value: IRandomAccessStreamReferenceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRandomAccessStreamReferenceStatics {
    public val __151195179_Ptr: Pointer?

    public val _151195179_VtblPtr: Pointer?
      get() = __151195179_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromFile(`file`: IStorageFile?): RandomAccessStreamReference? {
      val fnPtr = _151195179_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__151195179_Ptr, marshalToNative(file), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RandomAccessStreamReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromUri(uri: Uri?): RandomAccessStreamReference? {
      val fnPtr = _151195179_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__151195179_Ptr, marshalToNative(uri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RandomAccessStreamReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateFromStream(stream: IRandomAccessStream?):
        RandomAccessStreamReference? {
      val fnPtr = _151195179_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__151195179_Ptr, marshalToNative(stream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RandomAccessStreamReference>(result.getValue())
      return resultValue
    }
  }

  public class IRandomAccessStreamReferenceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __151195179_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRandomAccessStreamReferenceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("857309dc3fbf4e7d986fef3b1a07a964")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRandomAccessStreamReferenceStatics(ptr: Pointer?): WithDefault =
        IRandomAccessStreamReferenceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRandomAccessStreamReferenceStatics {
      val address = segment.toRawLongValue()
      return makeIRandomAccessStreamReferenceStatics(Pointer(address))
    }

    public override fun toNative(obj: IRandomAccessStreamReferenceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__151195179_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRandomAccessStreamReferenceStatics):
        Array<IRandomAccessStreamReferenceStatics?> = (elements as
        Array<IRandomAccessStreamReferenceStatics?>).castToImpl<IRandomAccessStreamReferenceStatics,IRandomAccessStreamReferenceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRandomAccessStreamReferenceStatics?> =
        arrayOfNulls<IRandomAccessStreamReferenceStatics_Impl>(size) as
        Array<IRandomAccessStreamReferenceStatics?>
  }
}
