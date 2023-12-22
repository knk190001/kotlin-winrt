package Windows.Foundation

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGetActivationFactory.ABI::class)
@Signature("{4edb8ee2-96dd-49a7-94f7-4607ddab8e3c}")
@Guid("4edb8ee296dd49a794f74607ddab8e3c")
@WinRTInterface("4edb8ee296dd49a794f74607ddab8e3c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGetActivationFactory.ByReference::class)
public interface IGetActivationFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetActivationFactory(activatableClassId: String?): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGetActivationFactory> {
    public override fun getValue() = ABI.makeIGetActivationFactory(pointer.getPointer(0))

    public fun setValue(value: IGetActivationFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGetActivationFactory {
    public val __2021398985_Ptr: Pointer?

    public val _2021398985_VtblPtr: Pointer?
      get() = __2021398985_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetActivationFactory(activatableClassId: String?): IUnknown? {
      val fnPtr = _2021398985_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__2021398985_Ptr, marshalToNative(activatableClassId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class IGetActivationFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2021398985_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGetActivationFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4edb8ee296dd49a794f74607ddab8e3c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGetActivationFactory(ptr: Pointer?): WithDefault =
        IGetActivationFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGetActivationFactory {
      val address = segment.toRawLongValue()
      return makeIGetActivationFactory(Pointer(address))
    }

    public override fun toNative(obj: IGetActivationFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2021398985_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGetActivationFactory): Array<IGetActivationFactory?> =
        (elements as
        Array<IGetActivationFactory?>).castToImpl<IGetActivationFactory,IGetActivationFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGetActivationFactory?> =
        arrayOfNulls<IGetActivationFactory_Impl>(size) as Array<IGetActivationFactory?>
  }
}
