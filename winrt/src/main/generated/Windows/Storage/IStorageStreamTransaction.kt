package Windows.Storage

import Windows.Foundation.IAsyncAction
import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import Windows.Storage.Streams.IRandomAccessStream
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

@ABIMarker(IStorageStreamTransaction.ABI::class)
@Signature("{f67cf363-a53d-4d94-ae2c-67232d93acdd}")
@Guid("f67cf363a53d4d94ae2c67232d93acdd")
@WinRTInterface("f67cf363a53d4d94ae2c67232d93acdd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageStreamTransaction.ByReference::class)
public interface IStorageStreamTransaction : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun get_Stream(): IRandomAccessStream?

  @InterfaceMethod(1)
  public fun CommitAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageStreamTransaction> {
    public override fun getValue() = ABI.makeIStorageStreamTransaction(pointer.getPointer(0))

    public fun setValue(value: IStorageStreamTransaction_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageStreamTransaction, IClosable.WithDefault {
    public val __1005653916_Ptr: Pointer?

    public val _1005653916_VtblPtr: Pointer?
      get() = __1005653916_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Stream(): IRandomAccessStream? {
      val fnPtr = _1005653916_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStream>()
      val hr = fn.invokeHR(arrayOf(__1005653916_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStream>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CommitAsync(): IAsyncAction? {
      val fnPtr = _1005653916_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1005653916_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IStorageStreamTransaction_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1005653916_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1005653916_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageStreamTransaction, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f67cf363a53d4d94ae2c67232d93acdd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageStreamTransaction(ptr: Pointer?): WithDefault =
        IStorageStreamTransaction_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageStreamTransaction {
      val address = segment.toRawLongValue()
      return makeIStorageStreamTransaction(Pointer(address))
    }

    public override fun toNative(obj: IStorageStreamTransaction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1005653916_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageStreamTransaction):
        Array<IStorageStreamTransaction?> = (elements as
        Array<IStorageStreamTransaction?>).castToImpl<IStorageStreamTransaction,IStorageStreamTransaction_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageStreamTransaction?> =
        arrayOfNulls<IStorageStreamTransaction_Impl>(size) as Array<IStorageStreamTransaction?>
  }
}
