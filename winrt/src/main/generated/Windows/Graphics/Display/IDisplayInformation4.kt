package Windows.Graphics.Display

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IDisplayInformation4.ABI::class)
@Signature("{c972ce2f-1242-46be-b536-e1aafe9e7acf}")
@Guid("c972ce2f124246beb536e1aafe9e7acf")
@WinRTInterface("c972ce2f124246beb536e1aafe9e7acf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayInformation4.ByReference::class)
public interface IDisplayInformation4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ScreenWidthInRawPixels(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_ScreenHeightInRawPixels(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayInformation4> {
    public override fun getValue() = ABI.makeIDisplayInformation4(pointer.getPointer(0))

    public fun setValue(value: IDisplayInformation4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayInformation4 {
    public val __1563419925_Ptr: Pointer?

    public val _1563419925_VtblPtr: Pointer?
      get() = __1563419925_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ScreenWidthInRawPixels(): WinDef.UINT {
      val fnPtr = _1563419925_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1563419925_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_ScreenHeightInRawPixels(): WinDef.UINT {
      val fnPtr = _1563419925_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1563419925_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IDisplayInformation4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1563419925_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayInformation4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c972ce2f124246beb536e1aafe9e7acf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayInformation4(ptr: Pointer?): WithDefault = IDisplayInformation4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayInformation4 {
      val address = segment.toRawLongValue()
      return makeIDisplayInformation4(Pointer(address))
    }

    public override fun toNative(obj: IDisplayInformation4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1563419925_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayInformation4): Array<IDisplayInformation4?> =
        (elements as
        Array<IDisplayInformation4?>).castToImpl<IDisplayInformation4,IDisplayInformation4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayInformation4?> =
        arrayOfNulls<IDisplayInformation4_Impl>(size) as Array<IDisplayInformation4?>
  }
}
