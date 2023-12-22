package Windows.ApplicationModel.Contacts

import Windows.Foundation.IReference
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IContactDate.ABI::class)
@Signature("{fe98ae66-b205-4934-9174-0ff2b0565707}")
@Guid("fe98ae66b205493491740ff2b0565707")
@WinRTInterface("fe98ae66b205493491740ff2b0565707")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactDate.ByReference::class)
public interface IContactDate : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Day(): IReference<WinDef.UINT>?

  @InterfaceMethod(1)
  public fun put_Day(value: IReference<WinDef.UINT>?): Unit

  @InterfaceMethod(2)
  public fun get_Month(): IReference<WinDef.UINT>?

  @InterfaceMethod(3)
  public fun put_Month(value: IReference<WinDef.UINT>?): Unit

  @InterfaceMethod(4)
  public fun get_Year(): IReference<Int>?

  @InterfaceMethod(5)
  public fun put_Year(value: IReference<Int>?): Unit

  @InterfaceMethod(6)
  public fun get_Kind(): ContactDateKind?

  @InterfaceMethod(7)
  public fun put_Kind(value: ContactDateKind?): Unit

  @InterfaceMethod(8)
  public fun get_Description(): String?

  @InterfaceMethod(9)
  public fun put_Description(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IContactDate> {
    public override fun getValue() = ABI.makeIContactDate(pointer.getPointer(0))

    public fun setValue(value: IContactDate_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactDate {
    public val __42825854_Ptr: Pointer?

    public val _42825854_VtblPtr: Pointer?
      get() = __42825854_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Day(): IReference<WinDef.UINT>? {
      val fnPtr = _42825854_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__42825854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Day(value: IReference<WinDef.UINT>?): Unit {
      val fnPtr = _42825854_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__42825854_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Month(): IReference<WinDef.UINT>? {
      val fnPtr = _42825854_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__42825854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Month(value: IReference<WinDef.UINT>?): Unit {
      val fnPtr = _42825854_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__42825854_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Year(): IReference<Int>? {
      val fnPtr = _42825854_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__42825854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Year(value: IReference<Int>?): Unit {
      val fnPtr = _42825854_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__42825854_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Kind(): ContactDateKind? {
      val fnPtr = _42825854_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactDateKind>()
      val hr = fn.invokeHR(arrayOf(__42825854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactDateKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Kind(value: ContactDateKind?): Unit {
      val fnPtr = _42825854_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__42825854_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Description(): String? {
      val fnPtr = _42825854_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__42825854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_Description(value: String?): Unit {
      val fnPtr = _42825854_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__42825854_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContactDate_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __42825854_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactDate, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fe98ae66b205493491740ff2b0565707")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactDate(ptr: Pointer?): WithDefault = IContactDate_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactDate {
      val address = segment.toRawLongValue()
      return makeIContactDate(Pointer(address))
    }

    public override fun toNative(obj: IContactDate): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__42825854_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactDate): Array<IContactDate?> = (elements as
        Array<IContactDate?>).castToImpl<IContactDate,IContactDate_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactDate?> =
        arrayOfNulls<IContactDate_Impl>(size) as Array<IContactDate?>
  }
}
