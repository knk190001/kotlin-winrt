package Windows.Services.Store

import Windows.System.User
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStoreContextStatics.ABI::class)
@Signature("{9c06ee5f-15c0-4e72-9330-d6191cebd19c}")
@Guid("9c06ee5f15c04e729330d6191cebd19c")
@WinRTInterface("9c06ee5f15c04e729330d6191cebd19c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStoreContextStatics.ByReference::class)
public interface IStoreContextStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): StoreContext?

  @InterfaceMethod(1)
  public fun GetForUser(user: User?): StoreContext?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStoreContextStatics> {
    public override fun getValue() = ABI.makeIStoreContextStatics(pointer.getPointer(0))

    public fun setValue(value: IStoreContextStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStoreContextStatics {
    public val __1037633418_Ptr: Pointer?

    public val _1037633418_VtblPtr: Pointer?
      get() = __1037633418_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): StoreContext? {
      val fnPtr = _1037633418_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StoreContext>()
      val hr = fn.invokeHR(arrayOf(__1037633418_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StoreContext>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetForUser(user: User?): StoreContext? {
      val fnPtr = _1037633418_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StoreContext>()
      val hr = fn.invokeHR(arrayOf(__1037633418_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StoreContext>(result.getValue())
      return resultValue
    }
  }

  public class IStoreContextStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1037633418_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStoreContextStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9c06ee5f15c04e729330d6191cebd19c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStoreContextStatics(ptr: Pointer?): WithDefault = IStoreContextStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStoreContextStatics {
      val address = segment.toRawLongValue()
      return makeIStoreContextStatics(Pointer(address))
    }

    public override fun toNative(obj: IStoreContextStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1037633418_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStoreContextStatics): Array<IStoreContextStatics?> =
        (elements as
        Array<IStoreContextStatics?>).castToImpl<IStoreContextStatics,IStoreContextStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStoreContextStatics?> =
        arrayOfNulls<IStoreContextStatics_Impl>(size) as Array<IStoreContextStatics?>
  }
}
