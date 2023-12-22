package Windows.Storage.Search

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
import Windows.Storage.IStorageItem
import Windows.Storage.Search.IStorageQueryResultBase.ABI.IID
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

@ABIMarker(IStorageItemQueryResult.ABI::class)
@Signature("{e8948079-9d58-47b8-b2b2-41b07f4795f9}")
@Guid("e89480799d5847b8b2b241b07f4795f9")
@WinRTInterface("e89480799d5847b8b2b241b07f4795f9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageItemQueryResult.ByReference::class)
public interface IStorageItemQueryResult : NativeMapped, IWinRTInterface, IStorageQueryResultBase {
  @InterfaceMethod(0)
  public fun GetItemsAsync(startIndex: WinDef.UINT, maxNumberOfItems: WinDef.UINT):
      IAsyncOperation<IVectorView<IStorageItem?>?>?

  @InterfaceMethod(1)
  public fun GetItemsAsync(): IAsyncOperation<IVectorView<IStorageItem?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageItemQueryResult> {
    public override fun getValue() = ABI.makeIStorageItemQueryResult(pointer.getPointer(0))

    public fun setValue(value: IStorageItemQueryResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageItemQueryResult, IStorageQueryResultBase.WithDefault {
    public val __678093626_Ptr: Pointer?

    public val _678093626_VtblPtr: Pointer?
      get() = __678093626_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetItemsAsync(startIndex: WinDef.UINT, maxNumberOfItems: WinDef.UINT):
        IAsyncOperation<IVectorView<IStorageItem?>?>? {
      val fnPtr = _678093626_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<IStorageItem?>?>>()
      val hr = fn.invokeHR(arrayOf(__678093626_Ptr, startIndex, maxNumberOfItems, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<IStorageItem?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetItemsAsync(): IAsyncOperation<IVectorView<IStorageItem?>?>? {
      val fnPtr = _678093626_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<IStorageItem?>?>>()
      val hr = fn.invokeHR(arrayOf(__678093626_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<IStorageItem?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IStorageItemQueryResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IStorageQueryResultBase {
    public override val __1632583490_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_678093626_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __678093626_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageItemQueryResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e89480799d5847b8b2b241b07f4795f9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageItemQueryResult(ptr: Pointer?): WithDefault =
        IStorageItemQueryResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageItemQueryResult {
      val address = segment.toRawLongValue()
      return makeIStorageItemQueryResult(Pointer(address))
    }

    public override fun toNative(obj: IStorageItemQueryResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__678093626_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageItemQueryResult): Array<IStorageItemQueryResult?>
        = (elements as
        Array<IStorageItemQueryResult?>).castToImpl<IStorageItemQueryResult,IStorageItemQueryResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageItemQueryResult?> =
        arrayOfNulls<IStorageItemQueryResult_Impl>(size) as Array<IStorageItemQueryResult?>
  }
}
