package Windows.ApplicationModel.LockScreen

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

@ABIMarker(ILockApplicationHostStatics.ABI::class)
@Signature("{f48fab8e-23d7-4e63-96a1-666ff52d3b2c}")
@Guid("f48fab8e23d74e6396a1666ff52d3b2c")
@WinRTInterface("f48fab8e23d74e6396a1666ff52d3b2c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILockApplicationHostStatics.ByReference::class)
public interface ILockApplicationHostStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForCurrentView(): LockApplicationHost?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILockApplicationHostStatics> {
    public override fun getValue() = ABI.makeILockApplicationHostStatics(pointer.getPointer(0))

    public fun setValue(value: ILockApplicationHostStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILockApplicationHostStatics {
    public val __909760160_Ptr: Pointer?

    public val _909760160_VtblPtr: Pointer?
      get() = __909760160_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForCurrentView(): LockApplicationHost? {
      val fnPtr = _909760160_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LockApplicationHost>()
      val hr = fn.invokeHR(arrayOf(__909760160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LockApplicationHost>(result.getValue())
      return resultValue
    }
  }

  public class ILockApplicationHostStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __909760160_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILockApplicationHostStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f48fab8e23d74e6396a1666ff52d3b2c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILockApplicationHostStatics(ptr: Pointer?): WithDefault =
        ILockApplicationHostStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILockApplicationHostStatics {
      val address = segment.toRawLongValue()
      return makeILockApplicationHostStatics(Pointer(address))
    }

    public override fun toNative(obj: ILockApplicationHostStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__909760160_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILockApplicationHostStatics):
        Array<ILockApplicationHostStatics?> = (elements as
        Array<ILockApplicationHostStatics?>).castToImpl<ILockApplicationHostStatics,ILockApplicationHostStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILockApplicationHostStatics?> =
        arrayOfNulls<ILockApplicationHostStatics_Impl>(size) as Array<ILockApplicationHostStatics?>
  }
}
