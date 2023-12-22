package Windows.ApplicationModel.Contacts

import Windows.Foundation.Collections.IVector
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IContactQueryOptions.ABI::class)
@Signature("{4408cc9e-7d7c-42f0-8ac7-f50733ecdbc1}")
@Guid("4408cc9e7d7c42f08ac7f50733ecdbc1")
@WinRTInterface("4408cc9e7d7c42f08ac7f50733ecdbc1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactQueryOptions.ByReference::class)
public interface IContactQueryOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TextSearch(): ContactQueryTextSearch?

  @InterfaceMethod(1)
  public fun get_ContactListIds(): IVector<String?>?

  @InterfaceMethod(2)
  public fun get_IncludeContactsFromHiddenLists(): Boolean

  @InterfaceMethod(3)
  public fun put_IncludeContactsFromHiddenLists(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_DesiredFields(): ContactQueryDesiredFields?

  @InterfaceMethod(5)
  public fun put_DesiredFields(value: ContactQueryDesiredFields?): Unit

  @InterfaceMethod(6)
  public fun get_DesiredOperations(): ContactAnnotationOperations?

  @InterfaceMethod(7)
  public fun put_DesiredOperations(value: ContactAnnotationOperations?): Unit

  @InterfaceMethod(8)
  public fun get_AnnotationListIds(): IVector<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactQueryOptions> {
    public override fun getValue() = ABI.makeIContactQueryOptions(pointer.getPointer(0))

    public fun setValue(value: IContactQueryOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactQueryOptions {
    public val __1006147722_Ptr: Pointer?

    public val _1006147722_VtblPtr: Pointer?
      get() = __1006147722_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TextSearch(): ContactQueryTextSearch? {
      val fnPtr = _1006147722_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactQueryTextSearch>()
      val hr = fn.invokeHR(arrayOf(__1006147722_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactQueryTextSearch>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ContactListIds(): IVector<String?>? {
      val fnPtr = _1006147722_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__1006147722_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IncludeContactsFromHiddenLists(): Boolean {
      val fnPtr = _1006147722_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1006147722_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IncludeContactsFromHiddenLists(value: Boolean): Unit {
      val fnPtr = _1006147722_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1006147722_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_DesiredFields(): ContactQueryDesiredFields? {
      val fnPtr = _1006147722_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactQueryDesiredFields>()
      val hr = fn.invokeHR(arrayOf(__1006147722_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactQueryDesiredFields>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_DesiredFields(value: ContactQueryDesiredFields?): Unit {
      val fnPtr = _1006147722_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1006147722_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_DesiredOperations(): ContactAnnotationOperations? {
      val fnPtr = _1006147722_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactAnnotationOperations>()
      val hr = fn.invokeHR(arrayOf(__1006147722_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactAnnotationOperations>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_DesiredOperations(value: ContactAnnotationOperations?): Unit {
      val fnPtr = _1006147722_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1006147722_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_AnnotationListIds(): IVector<String?>? {
      val fnPtr = _1006147722_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__1006147722_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }
  }

  public class IContactQueryOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1006147722_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactQueryOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4408cc9e7d7c42f08ac7f50733ecdbc1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactQueryOptions(ptr: Pointer?): WithDefault = IContactQueryOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactQueryOptions {
      val address = segment.toRawLongValue()
      return makeIContactQueryOptions(Pointer(address))
    }

    public override fun toNative(obj: IContactQueryOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1006147722_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactQueryOptions): Array<IContactQueryOptions?> =
        (elements as
        Array<IContactQueryOptions?>).castToImpl<IContactQueryOptions,IContactQueryOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactQueryOptions?> =
        arrayOfNulls<IContactQueryOptions_Impl>(size) as Array<IContactQueryOptions?>
  }
}
