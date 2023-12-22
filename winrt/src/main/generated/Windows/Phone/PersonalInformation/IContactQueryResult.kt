package Windows.Phone.PersonalInformation

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

@ABIMarker(IContactQueryResult.ABI::class)
@Signature("{c03db722-ecdb-4700-857e-3e786426b04b}")
@Guid("c03db722ecdb4700857e3e786426b04b")
@WinRTInterface("c03db722ecdb4700857e3e786426b04b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactQueryResult.ByReference::class)
public interface IContactQueryResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetContactCountAsync(): IAsyncOperation<WinDef.UINT>?

  @InterfaceMethod(1)
  public fun GetContactsAsync(): IAsyncOperation<IVectorView<StoredContact?>?>?

  @InterfaceMethod(2)
  public fun GetContactsAsync(startIndex: WinDef.UINT, maxNumberOfItems: WinDef.UINT):
      IAsyncOperation<IVectorView<StoredContact?>?>?

  @InterfaceMethod(3)
  public fun GetCurrentQueryOptions(): ContactQueryOptions?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactQueryResult> {
    public override fun getValue() = ABI.makeIContactQueryResult(pointer.getPointer(0))

    public fun setValue(value: IContactQueryResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactQueryResult {
    public val __1019541261_Ptr: Pointer?

    public val _1019541261_VtblPtr: Pointer?
      get() = __1019541261_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetContactCountAsync(): IAsyncOperation<WinDef.UINT>? {
      val fnPtr = _1019541261_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1019541261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetContactsAsync(): IAsyncOperation<IVectorView<StoredContact?>?>? {
      val fnPtr = _1019541261_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<StoredContact?>?>>()
      val hr = fn.invokeHR(arrayOf(__1019541261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<StoredContact?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetContactsAsync(startIndex: WinDef.UINT, maxNumberOfItems: WinDef.UINT):
        IAsyncOperation<IVectorView<StoredContact?>?>? {
      val fnPtr = _1019541261_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<StoredContact?>?>>()
      val hr = fn.invokeHR(arrayOf(__1019541261_Ptr, startIndex, maxNumberOfItems, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<StoredContact?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetCurrentQueryOptions(): ContactQueryOptions? {
      val fnPtr = _1019541261_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactQueryOptions>()
      val hr = fn.invokeHR(arrayOf(__1019541261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactQueryOptions>(result.getValue())
      return resultValue
    }
  }

  public class IContactQueryResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1019541261_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactQueryResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c03db722ecdb4700857e3e786426b04b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactQueryResult(ptr: Pointer?): WithDefault = IContactQueryResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactQueryResult {
      val address = segment.toRawLongValue()
      return makeIContactQueryResult(Pointer(address))
    }

    public override fun toNative(obj: IContactQueryResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1019541261_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactQueryResult): Array<IContactQueryResult?> =
        (elements as
        Array<IContactQueryResult?>).castToImpl<IContactQueryResult,IContactQueryResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactQueryResult?> =
        arrayOfNulls<IContactQueryResult_Impl>(size) as Array<IContactQueryResult?>
  }
}
