package Windows.UI.Xaml.Markup

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

@ABIMarker(IComponentConnector.ABI::class)
@Signature("{f6790987-e6e5-47f2-92c6-eccce4ba159a}")
@Guid("f6790987e6e547f292c6eccce4ba159a")
@WinRTInterface("f6790987e6e547f292c6eccce4ba159a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IComponentConnector.ByReference::class)
public interface IComponentConnector : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Connect(connectionId: Int, target: IUnknown?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IComponentConnector> {
    public override fun getValue() = ABI.makeIComponentConnector(pointer.getPointer(0))

    public fun setValue(value: IComponentConnector_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IComponentConnector {
    public val __1930681978_Ptr: Pointer?

    public val _1930681978_VtblPtr: Pointer?
      get() = __1930681978_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Connect(connectionId: Int, target: IUnknown?): Unit {
      val fnPtr = _1930681978_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1930681978_Ptr, connectionId, marshalToNative(target),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IComponentConnector_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1930681978_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IComponentConnector, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f6790987e6e547f292c6eccce4ba159a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIComponentConnector(ptr: Pointer?): WithDefault = IComponentConnector_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IComponentConnector {
      val address = segment.toRawLongValue()
      return makeIComponentConnector(Pointer(address))
    }

    public override fun toNative(obj: IComponentConnector): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1930681978_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IComponentConnector): Array<IComponentConnector?> =
        (elements as
        Array<IComponentConnector?>).castToImpl<IComponentConnector,IComponentConnector_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IComponentConnector?> =
        arrayOfNulls<IComponentConnector_Impl>(size) as Array<IComponentConnector?>
  }
}
