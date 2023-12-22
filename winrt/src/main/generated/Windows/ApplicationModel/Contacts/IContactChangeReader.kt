package Windows.ApplicationModel.Contacts

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IContactChangeReader.ABI::class)
@Signature("{217319fa-2d0c-42e0-a9da-3ecd56a78a47}")
@Guid("217319fa2d0c42e0a9da3ecd56a78a47")
@WinRTInterface("217319fa2d0c42e0a9da3ecd56a78a47")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactChangeReader.ByReference::class)
public interface IContactChangeReader : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AcceptChanges(): Unit

  @InterfaceMethod(1)
  public fun AcceptChangesThrough(lastChangeToAccept: ContactChange?): Unit

  @InterfaceMethod(2)
  public fun ReadBatchAsync(): IAsyncOperation<IVectorView<ContactChange?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactChangeReader> {
    public override fun getValue() = ABI.makeIContactChangeReader(pointer.getPointer(0))

    public fun setValue(value: IContactChangeReader_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactChangeReader {
    public val __676878439_Ptr: Pointer?

    public val _676878439_VtblPtr: Pointer?
      get() = __676878439_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AcceptChanges(): Unit {
      val fnPtr = _676878439_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__676878439_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun AcceptChangesThrough(lastChangeToAccept: ContactChange?): Unit {
      val fnPtr = _676878439_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__676878439_Ptr, marshalToNative(lastChangeToAccept),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun ReadBatchAsync(): IAsyncOperation<IVectorView<ContactChange?>?>? {
      val fnPtr = _676878439_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<ContactChange?>?>>()
      val hr = fn.invokeHR(arrayOf(__676878439_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<ContactChange?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IContactChangeReader_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __676878439_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactChangeReader, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("217319fa2d0c42e0a9da3ecd56a78a47")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactChangeReader(ptr: Pointer?): WithDefault = IContactChangeReader_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactChangeReader {
      val address = segment.toRawLongValue()
      return makeIContactChangeReader(Pointer(address))
    }

    public override fun toNative(obj: IContactChangeReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__676878439_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactChangeReader): Array<IContactChangeReader?> =
        (elements as
        Array<IContactChangeReader?>).castToImpl<IContactChangeReader,IContactChangeReader_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactChangeReader?> =
        arrayOfNulls<IContactChangeReader_Impl>(size) as Array<IContactChangeReader?>
  }
}
