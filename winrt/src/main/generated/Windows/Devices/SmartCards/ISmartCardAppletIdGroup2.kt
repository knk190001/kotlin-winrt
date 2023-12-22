package Windows.Devices.SmartCards

import Windows.Foundation.Collections.ValueSet
import Windows.Storage.Streams.IRandomAccessStreamReference
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

@ABIMarker(ISmartCardAppletIdGroup2.ABI::class)
@Signature("{6b0ef9dc-9956-4a62-8d4e-d37a68ebc3a6}")
@Guid("6b0ef9dc99564a628d4ed37a68ebc3a6")
@WinRTInterface("6b0ef9dc99564a628d4ed37a68ebc3a6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardAppletIdGroup2.ByReference::class)
public interface ISmartCardAppletIdGroup2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Logo(): IRandomAccessStreamReference?

  @InterfaceMethod(1)
  public fun put_Logo(value: IRandomAccessStreamReference?): Unit

  @InterfaceMethod(2)
  public fun get_Description(): String?

  @InterfaceMethod(3)
  public fun put_Description(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_Properties(): ValueSet?

  @InterfaceMethod(5)
  public fun get_SecureUserAuthenticationRequired(): Boolean

  @InterfaceMethod(6)
  public fun put_SecureUserAuthenticationRequired(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardAppletIdGroup2> {
    public override fun getValue() = ABI.makeISmartCardAppletIdGroup2(pointer.getPointer(0))

    public fun setValue(value: ISmartCardAppletIdGroup2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardAppletIdGroup2 {
    public val __1054021582_Ptr: Pointer?

    public val _1054021582_VtblPtr: Pointer?
      get() = __1054021582_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Logo(): IRandomAccessStreamReference? {
      val fnPtr = _1054021582_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__1054021582_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Logo(value: IRandomAccessStreamReference?): Unit {
      val fnPtr = _1054021582_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1054021582_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Description(): String? {
      val fnPtr = _1054021582_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1054021582_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Description(value: String?): Unit {
      val fnPtr = _1054021582_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1054021582_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Properties(): ValueSet? {
      val fnPtr = _1054021582_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ValueSet>()
      val hr = fn.invokeHR(arrayOf(__1054021582_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ValueSet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_SecureUserAuthenticationRequired(): Boolean {
      val fnPtr = _1054021582_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1054021582_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_SecureUserAuthenticationRequired(value: Boolean): Unit {
      val fnPtr = _1054021582_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1054021582_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISmartCardAppletIdGroup2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1054021582_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardAppletIdGroup2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6b0ef9dc99564a628d4ed37a68ebc3a6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardAppletIdGroup2(ptr: Pointer?): WithDefault =
        ISmartCardAppletIdGroup2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmartCardAppletIdGroup2 {
      val address = segment.toRawLongValue()
      return makeISmartCardAppletIdGroup2(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardAppletIdGroup2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1054021582_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardAppletIdGroup2):
        Array<ISmartCardAppletIdGroup2?> = (elements as
        Array<ISmartCardAppletIdGroup2?>).castToImpl<ISmartCardAppletIdGroup2,ISmartCardAppletIdGroup2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardAppletIdGroup2?> =
        arrayOfNulls<ISmartCardAppletIdGroup2_Impl>(size) as Array<ISmartCardAppletIdGroup2?>
  }
}
