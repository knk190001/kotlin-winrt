package Microsoft.UI.Xaml

import Microsoft.UI.Content.ContentIslandEnvironment
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

@ABIMarker(IXamlRoot2.ABI::class)
@Signature("{bdee0f42-71cb-50c5-829b-4614d98c5794}")
@Guid("bdee0f4271cb50c5829b4614d98c5794")
@WinRTInterface("bdee0f4271cb50c5829b4614d98c5794")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlRoot2.ByReference::class)
public interface IXamlRoot2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContentIslandEnvironment(): ContentIslandEnvironment?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IXamlRoot2> {
    public override fun getValue() = ABI.makeIXamlRoot2(pointer.getPointer(0))

    public fun setValue(value: IXamlRoot2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlRoot2 {
    public val __806159935_Ptr: Pointer?

    public val _806159935_VtblPtr: Pointer?
      get() = __806159935_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContentIslandEnvironment(): ContentIslandEnvironment? {
      val fnPtr = _806159935_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentIslandEnvironment>()
      val hr = fn.invokeHR(arrayOf(__806159935_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentIslandEnvironment>(result.getValue())
      return resultValue
    }
  }

  public class IXamlRoot2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __806159935_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlRoot2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bdee0f4271cb50c5829b4614d98c5794")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlRoot2(ptr: Pointer?): WithDefault = IXamlRoot2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlRoot2 {
      val address = segment.toRawLongValue()
      return makeIXamlRoot2(Pointer(address))
    }

    public override fun toNative(obj: IXamlRoot2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__806159935_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlRoot2): Array<IXamlRoot2?> = (elements as
        Array<IXamlRoot2?>).castToImpl<IXamlRoot2,IXamlRoot2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlRoot2?> = arrayOfNulls<IXamlRoot2_Impl>(size)
        as Array<IXamlRoot2?>
  }
}
