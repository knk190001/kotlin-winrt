package Windows.ApplicationModel.Store

import Windows.Foundation.DateTime
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

@ABIMarker(IProductLicense.ABI::class)
@Signature("{363308c7-2bcf-4c0e-8f2f-e808aaa8f99d}")
@Guid("363308c72bcf4c0e8f2fe808aaa8f99d")
@WinRTInterface("363308c72bcf4c0e8f2fe808aaa8f99d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProductLicense.ByReference::class)
public interface IProductLicense : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ProductId(): String?

  @InterfaceMethod(1)
  public fun get_IsActive(): Boolean

  @InterfaceMethod(2)
  public fun get_ExpirationDate(): DateTime?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProductLicense> {
    public override fun getValue() = ABI.makeIProductLicense(pointer.getPointer(0))

    public fun setValue(value: IProductLicense_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProductLicense {
    public val __1232561724_Ptr: Pointer?

    public val _1232561724_VtblPtr: Pointer?
      get() = __1232561724_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ProductId(): String? {
      val fnPtr = _1232561724_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1232561724_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsActive(): Boolean {
      val fnPtr = _1232561724_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1232561724_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_ExpirationDate(): DateTime? {
      val fnPtr = _1232561724_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1232561724_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }
  }

  public class IProductLicense_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1232561724_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProductLicense, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("363308c72bcf4c0e8f2fe808aaa8f99d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProductLicense(ptr: Pointer?): WithDefault = IProductLicense_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProductLicense {
      val address = segment.toRawLongValue()
      return makeIProductLicense(Pointer(address))
    }

    public override fun toNative(obj: IProductLicense): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1232561724_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProductLicense): Array<IProductLicense?> = (elements as
        Array<IProductLicense?>).castToImpl<IProductLicense,IProductLicense_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProductLicense?> =
        arrayOfNulls<IProductLicense_Impl>(size) as Array<IProductLicense?>
  }
}
