package Windows.Services.Store

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStorePurchaseProperties.ABI::class)
@Signature("{836278f3-ff87-4364-a5b4-fd2153ebe43b}")
@Guid("836278f3ff874364a5b4fd2153ebe43b")
@WinRTInterface("836278f3ff874364a5b4fd2153ebe43b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorePurchaseProperties.ByReference::class)
public interface IStorePurchaseProperties : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun put_Name(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_ExtendedJsonData(): String?

  @InterfaceMethod(3)
  public fun put_ExtendedJsonData(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorePurchaseProperties> {
    public override fun getValue() = ABI.makeIStorePurchaseProperties(pointer.getPointer(0))

    public fun setValue(value: IStorePurchaseProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorePurchaseProperties {
    public val __378871688_Ptr: Pointer?

    public val _378871688_VtblPtr: Pointer?
      get() = __378871688_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _378871688_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__378871688_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Name(value: String?): Unit {
      val fnPtr = _378871688_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__378871688_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ExtendedJsonData(): String? {
      val fnPtr = _378871688_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__378871688_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_ExtendedJsonData(value: String?): Unit {
      val fnPtr = _378871688_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__378871688_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStorePurchaseProperties_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __378871688_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorePurchaseProperties, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("836278f3ff874364a5b4fd2153ebe43b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorePurchaseProperties(ptr: Pointer?): WithDefault =
        IStorePurchaseProperties_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorePurchaseProperties {
      val address = segment.toRawLongValue()
      return makeIStorePurchaseProperties(Pointer(address))
    }

    public override fun toNative(obj: IStorePurchaseProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__378871688_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorePurchaseProperties):
        Array<IStorePurchaseProperties?> = (elements as
        Array<IStorePurchaseProperties?>).castToImpl<IStorePurchaseProperties,IStorePurchaseProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorePurchaseProperties?> =
        arrayOfNulls<IStorePurchaseProperties_Impl>(size) as Array<IStorePurchaseProperties?>
  }
}
