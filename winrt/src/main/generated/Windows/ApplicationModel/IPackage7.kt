package Windows.ApplicationModel

import Windows.Storage.StorageFolder
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

@ABIMarker(IPackage7.ABI::class)
@Signature("{86ff8d31-a2e4-45e0-9732-283a6d88fde1}")
@Guid("86ff8d31a2e445e09732283a6d88fde1")
@WinRTInterface("86ff8d31a2e445e09732283a6d88fde1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackage7.ByReference::class)
public interface IPackage7 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MutableLocation(): StorageFolder?

  @InterfaceMethod(1)
  public fun get_EffectiveLocation(): StorageFolder?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPackage7> {
    public override fun getValue() = ABI.makeIPackage7(pointer.getPointer(0))

    public fun setValue(value: IPackage7_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackage7 {
    public val __1252479850_Ptr: Pointer?

    public val _1252479850_VtblPtr: Pointer?
      get() = __1252479850_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MutableLocation(): StorageFolder? {
      val fnPtr = _1252479850_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFolder>()
      val hr = fn.invokeHR(arrayOf(__1252479850_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFolder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_EffectiveLocation(): StorageFolder? {
      val fnPtr = _1252479850_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFolder>()
      val hr = fn.invokeHR(arrayOf(__1252479850_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFolder>(result.getValue())
      return resultValue
    }
  }

  public class IPackage7_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1252479850_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackage7, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("86ff8d31a2e445e09732283a6d88fde1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackage7(ptr: Pointer?): WithDefault = IPackage7_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackage7 {
      val address = segment.toRawLongValue()
      return makeIPackage7(Pointer(address))
    }

    public override fun toNative(obj: IPackage7): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1252479850_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackage7): Array<IPackage7?> = (elements as
        Array<IPackage7?>).castToImpl<IPackage7,IPackage7_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackage7?> = arrayOfNulls<IPackage7_Impl>(size)
        as Array<IPackage7?>
  }
}
