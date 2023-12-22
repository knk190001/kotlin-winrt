package Windows.ApplicationModel.Contacts

import Windows.Foundation.Collections.ValueSet
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

@ABIMarker(IContactAnnotation.ABI::class)
@Signature("{821fc2ef-7d41-44a2-84c3-60a281dd7b86}")
@Guid("821fc2ef7d4144a284c360a281dd7b86")
@WinRTInterface("821fc2ef7d4144a284c360a281dd7b86")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactAnnotation.ByReference::class)
public interface IContactAnnotation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun get_AnnotationListId(): String?

  @InterfaceMethod(2)
  public fun get_ContactId(): String?

  @InterfaceMethod(3)
  public fun put_ContactId(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_RemoteId(): String?

  @InterfaceMethod(5)
  public fun put_RemoteId(value: String?): Unit

  @InterfaceMethod(6)
  public fun get_SupportedOperations(): ContactAnnotationOperations?

  @InterfaceMethod(7)
  public fun put_SupportedOperations(value: ContactAnnotationOperations?): Unit

  @InterfaceMethod(8)
  public fun get_IsDisabled(): Boolean

  @InterfaceMethod(9)
  public fun get_ProviderProperties(): ValueSet?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactAnnotation> {
    public override fun getValue() = ABI.makeIContactAnnotation(pointer.getPointer(0))

    public fun setValue(value: IContactAnnotation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactAnnotation {
    public val __34647037_Ptr: Pointer?

    public val _34647037_VtblPtr: Pointer?
      get() = __34647037_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _34647037_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__34647037_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AnnotationListId(): String? {
      val fnPtr = _34647037_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__34647037_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ContactId(): String? {
      val fnPtr = _34647037_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__34647037_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_ContactId(value: String?): Unit {
      val fnPtr = _34647037_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__34647037_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_RemoteId(): String? {
      val fnPtr = _34647037_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__34647037_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_RemoteId(value: String?): Unit {
      val fnPtr = _34647037_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__34647037_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_SupportedOperations(): ContactAnnotationOperations? {
      val fnPtr = _34647037_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactAnnotationOperations>()
      val hr = fn.invokeHR(arrayOf(__34647037_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactAnnotationOperations>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_SupportedOperations(value: ContactAnnotationOperations?): Unit {
      val fnPtr = _34647037_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__34647037_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_IsDisabled(): Boolean {
      val fnPtr = _34647037_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__34647037_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_ProviderProperties(): ValueSet? {
      val fnPtr = _34647037_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ValueSet>()
      val hr = fn.invokeHR(arrayOf(__34647037_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ValueSet>(result.getValue())
      return resultValue
    }
  }

  public class IContactAnnotation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __34647037_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactAnnotation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("821fc2ef7d4144a284c360a281dd7b86")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactAnnotation(ptr: Pointer?): WithDefault = IContactAnnotation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactAnnotation {
      val address = segment.toRawLongValue()
      return makeIContactAnnotation(Pointer(address))
    }

    public override fun toNative(obj: IContactAnnotation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__34647037_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactAnnotation): Array<IContactAnnotation?> =
        (elements as
        Array<IContactAnnotation?>).castToImpl<IContactAnnotation,IContactAnnotation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactAnnotation?> =
        arrayOfNulls<IContactAnnotation_Impl>(size) as Array<IContactAnnotation?>
  }
}
