package Microsoft.UI.Xaml.Controls

import Windows.Foundation.Point
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

@ABIMarker(IInsertionPanel.ABI::class)
@Signature("{84e13e27-2d24-59c4-a00e-16c7255901e2}")
@Guid("84e13e272d2459c4a00e16c7255901e2")
@WinRTInterface("84e13e272d2459c4a00e16c7255901e2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInsertionPanel.ByReference::class)
public interface IInsertionPanel : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetInsertionIndexes(
    position: Point?,
    first: Int,
    second: Int
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInsertionPanel> {
    public override fun getValue() = ABI.makeIInsertionPanel(pointer.getPointer(0))

    public fun setValue(value: IInsertionPanel_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInsertionPanel {
    public val __1932060188_Ptr: Pointer?

    public val _1932060188_VtblPtr: Pointer?
      get() = __1932060188_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetInsertionIndexes(
      position: Point?,
      first: Int,
      second: Int
    ): Unit {
      val fnPtr = _1932060188_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1932060188_Ptr, marshalToNative(position), first, second,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInsertionPanel_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1932060188_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInsertionPanel, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("84e13e272d2459c4a00e16c7255901e2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInsertionPanel(ptr: Pointer?): WithDefault = IInsertionPanel_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInsertionPanel {
      val address = segment.toRawLongValue()
      return makeIInsertionPanel(Pointer(address))
    }

    public override fun toNative(obj: IInsertionPanel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1932060188_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInsertionPanel): Array<IInsertionPanel?> = (elements as
        Array<IInsertionPanel?>).castToImpl<IInsertionPanel,IInsertionPanel_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInsertionPanel?> =
        arrayOfNulls<IInsertionPanel_Impl>(size) as Array<IInsertionPanel?>
  }
}
