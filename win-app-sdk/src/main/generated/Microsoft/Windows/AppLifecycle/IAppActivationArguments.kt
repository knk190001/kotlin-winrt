package Microsoft.Windows.AppLifecycle

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IAppActivationArguments.ABI::class)
@Signature("{14f99eaf-1580-5062-bdc8-d5d1c31138fb}")
@Guid("14f99eaf15805062bdc8d5d1c31138fb")
@WinRTInterface("14f99eaf15805062bdc8d5d1c31138fb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppActivationArguments.ByReference::class)
public interface IAppActivationArguments : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Kind(): ExtendedActivationKind?

  @InterfaceMethod(1)
  public fun get_Data(): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppActivationArguments> {
    public override fun getValue() = ABI.makeIAppActivationArguments(pointer.getPointer(0))

    public fun setValue(value: IAppActivationArguments_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppActivationArguments {
    public val __208932084_Ptr: Pointer?

    public val _208932084_VtblPtr: Pointer?
      get() = __208932084_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Kind(): ExtendedActivationKind? {
      val fnPtr = _208932084_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ExtendedActivationKind>()
      val hr = fn.invokeHR(arrayOf(__208932084_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ExtendedActivationKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Data(): IUnknown? {
      val fnPtr = _208932084_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__208932084_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class IAppActivationArguments_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __208932084_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppActivationArguments, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("14f99eaf15805062bdc8d5d1c31138fb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppActivationArguments(ptr: Pointer?): WithDefault =
        IAppActivationArguments_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppActivationArguments {
      val address = segment.toRawLongValue()
      return makeIAppActivationArguments(Pointer(address))
    }

    public override fun toNative(obj: IAppActivationArguments): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__208932084_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppActivationArguments): Array<IAppActivationArguments?>
        = (elements as
        Array<IAppActivationArguments?>).castToImpl<IAppActivationArguments,IAppActivationArguments_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppActivationArguments?> =
        arrayOfNulls<IAppActivationArguments_Impl>(size) as Array<IAppActivationArguments?>
  }
}
