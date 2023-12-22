package Windows.UI.Xaml.Controls.Maps

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IMapControlStatics6.ABI::class)
@Signature("{3ccfdd7f-24d1-40a2-8351-b3063a8c95a4}")
@Guid("3ccfdd7f24d140a28351b3063a8c95a4")
@WinRTInterface("3ccfdd7f24d140a28351b3063a8c95a4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapControlStatics6.ByReference::class)
public interface IMapControlStatics6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LayersProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapControlStatics6> {
    public override fun getValue() = ABI.makeIMapControlStatics6(pointer.getPointer(0))

    public fun setValue(value: IMapControlStatics6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapControlStatics6 {
    public val __142000221_Ptr: Pointer?

    public val _142000221_VtblPtr: Pointer?
      get() = __142000221_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LayersProperty(): DependencyProperty? {
      val fnPtr = _142000221_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__142000221_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IMapControlStatics6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __142000221_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapControlStatics6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3ccfdd7f24d140a28351b3063a8c95a4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapControlStatics6(ptr: Pointer?): WithDefault = IMapControlStatics6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapControlStatics6 {
      val address = segment.toRawLongValue()
      return makeIMapControlStatics6(Pointer(address))
    }

    public override fun toNative(obj: IMapControlStatics6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__142000221_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapControlStatics6): Array<IMapControlStatics6?> =
        (elements as
        Array<IMapControlStatics6?>).castToImpl<IMapControlStatics6,IMapControlStatics6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapControlStatics6?> =
        arrayOfNulls<IMapControlStatics6_Impl>(size) as Array<IMapControlStatics6?>
  }
}
