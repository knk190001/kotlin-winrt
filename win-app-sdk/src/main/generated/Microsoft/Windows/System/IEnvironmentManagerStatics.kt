package Microsoft.Windows.System

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IEnvironmentManagerStatics.ABI::class)
@Signature("{407b1522-6156-5398-93fd-d6411c35e7b1}")
@Guid("407b15226156539893fdd6411c35e7b1")
@WinRTInterface("407b15226156539893fdd6411c35e7b1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEnvironmentManagerStatics.ByReference::class)
public interface IEnvironmentManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForProcess(): EnvironmentManager?

  @InterfaceMethod(1)
  public fun GetForUser(): EnvironmentManager?

  @InterfaceMethod(2)
  public fun GetForMachine(): EnvironmentManager?

  @InterfaceMethod(3)
  public fun get_IsSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEnvironmentManagerStatics> {
    public override fun getValue() = ABI.makeIEnvironmentManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IEnvironmentManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEnvironmentManagerStatics {
    public val __1009141980_Ptr: Pointer?

    public val _1009141980_VtblPtr: Pointer?
      get() = __1009141980_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForProcess(): EnvironmentManager? {
      val fnPtr = _1009141980_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EnvironmentManager>()
      val hr = fn.invokeHR(arrayOf(__1009141980_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EnvironmentManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetForUser(): EnvironmentManager? {
      val fnPtr = _1009141980_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EnvironmentManager>()
      val hr = fn.invokeHR(arrayOf(__1009141980_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EnvironmentManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetForMachine(): EnvironmentManager? {
      val fnPtr = _1009141980_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EnvironmentManager>()
      val hr = fn.invokeHR(arrayOf(__1009141980_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EnvironmentManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_IsSupported(): Boolean {
      val fnPtr = _1009141980_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1009141980_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IEnvironmentManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1009141980_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEnvironmentManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("407b15226156539893fdd6411c35e7b1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEnvironmentManagerStatics(ptr: Pointer?): WithDefault =
        IEnvironmentManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEnvironmentManagerStatics {
      val address = segment.toRawLongValue()
      return makeIEnvironmentManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IEnvironmentManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1009141980_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEnvironmentManagerStatics):
        Array<IEnvironmentManagerStatics?> = (elements as
        Array<IEnvironmentManagerStatics?>).castToImpl<IEnvironmentManagerStatics,IEnvironmentManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEnvironmentManagerStatics?> =
        arrayOfNulls<IEnvironmentManagerStatics_Impl>(size) as Array<IEnvironmentManagerStatics?>
  }
}
