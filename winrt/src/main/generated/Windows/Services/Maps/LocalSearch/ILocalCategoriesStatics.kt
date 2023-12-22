package Windows.Services.Maps.LocalSearch

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

@ABIMarker(ILocalCategoriesStatics.ABI::class)
@Signature("{f49399f5-8261-4321-9974-ef92d49a8dca}")
@Guid("f49399f5826143219974ef92d49a8dca")
@WinRTInterface("f49399f5826143219974ef92d49a8dca")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILocalCategoriesStatics.ByReference::class)
public interface ILocalCategoriesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BankAndCreditUnions(): String?

  @InterfaceMethod(1)
  public fun get_EatDrink(): String?

  @InterfaceMethod(2)
  public fun get_Hospitals(): String?

  @InterfaceMethod(3)
  public fun get_HotelsAndMotels(): String?

  @InterfaceMethod(4)
  public fun get_All(): String?

  @InterfaceMethod(5)
  public fun get_Parking(): String?

  @InterfaceMethod(6)
  public fun get_SeeDo(): String?

  @InterfaceMethod(7)
  public fun get_Shop(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILocalCategoriesStatics> {
    public override fun getValue() = ABI.makeILocalCategoriesStatics(pointer.getPointer(0))

    public fun setValue(value: ILocalCategoriesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILocalCategoriesStatics {
    public val __1010016090_Ptr: Pointer?

    public val _1010016090_VtblPtr: Pointer?
      get() = __1010016090_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BankAndCreditUnions(): String? {
      val fnPtr = _1010016090_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1010016090_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_EatDrink(): String? {
      val fnPtr = _1010016090_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1010016090_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Hospitals(): String? {
      val fnPtr = _1010016090_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1010016090_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_HotelsAndMotels(): String? {
      val fnPtr = _1010016090_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1010016090_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_All(): String? {
      val fnPtr = _1010016090_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1010016090_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Parking(): String? {
      val fnPtr = _1010016090_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1010016090_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_SeeDo(): String? {
      val fnPtr = _1010016090_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1010016090_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_Shop(): String? {
      val fnPtr = _1010016090_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1010016090_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ILocalCategoriesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1010016090_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILocalCategoriesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f49399f5826143219974ef92d49a8dca")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILocalCategoriesStatics(ptr: Pointer?): WithDefault =
        ILocalCategoriesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILocalCategoriesStatics {
      val address = segment.toRawLongValue()
      return makeILocalCategoriesStatics(Pointer(address))
    }

    public override fun toNative(obj: ILocalCategoriesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1010016090_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILocalCategoriesStatics): Array<ILocalCategoriesStatics?>
        = (elements as
        Array<ILocalCategoriesStatics?>).castToImpl<ILocalCategoriesStatics,ILocalCategoriesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILocalCategoriesStatics?> =
        arrayOfNulls<ILocalCategoriesStatics_Impl>(size) as Array<ILocalCategoriesStatics?>
  }
}
