package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IPipsPagerFactory.ABI::class)
@Signature("{020722cd-813a-5165-a899-3df9adcd805e}")
@Guid("020722cd813a5165a8993df9adcd805e")
@WinRTInterface("020722cd813a5165a8993df9adcd805e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPipsPagerFactory.ByReference::class)
public interface IPipsPagerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): PipsPager?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPipsPagerFactory> {
    public override fun getValue() = ABI.makeIPipsPagerFactory(pointer.getPointer(0))

    public fun setValue(value: IPipsPagerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPipsPagerFactory {
    public val __470899862_Ptr: Pointer?

    public val _470899862_VtblPtr: Pointer?
      get() = __470899862_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        PipsPager? {
      val fnPtr = _470899862_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PipsPager>()
      val hr = fn.invokeHR(arrayOf(__470899862_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PipsPager>(result.getValue())
      return resultValue
    }
  }

  public class IPipsPagerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __470899862_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPipsPagerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("020722cd813a5165a8993df9adcd805e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPipsPagerFactory(ptr: Pointer?): WithDefault = IPipsPagerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPipsPagerFactory {
      val address = segment.toRawLongValue()
      return makeIPipsPagerFactory(Pointer(address))
    }

    public override fun toNative(obj: IPipsPagerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__470899862_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPipsPagerFactory): Array<IPipsPagerFactory?> = (elements
        as Array<IPipsPagerFactory?>).castToImpl<IPipsPagerFactory,IPipsPagerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPipsPagerFactory?> =
        arrayOfNulls<IPipsPagerFactory_Impl>(size) as Array<IPipsPagerFactory?>
  }
}
