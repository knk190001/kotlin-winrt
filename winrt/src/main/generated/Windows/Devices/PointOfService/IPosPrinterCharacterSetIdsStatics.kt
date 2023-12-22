package Windows.Devices.PointOfService

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

@ABIMarker(IPosPrinterCharacterSetIdsStatics.ABI::class)
@Signature("{5c709eff-709a-4fe7-b215-06a748a38b39}")
@Guid("5c709eff709a4fe7b21506a748a38b39")
@WinRTInterface("5c709eff709a4fe7b21506a748a38b39")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPosPrinterCharacterSetIdsStatics.ByReference::class)
public interface IPosPrinterCharacterSetIdsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Utf16LE(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_Ascii(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_Ansi(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPosPrinterCharacterSetIdsStatics> {
    public override fun getValue() =
        ABI.makeIPosPrinterCharacterSetIdsStatics(pointer.getPointer(0))

    public fun setValue(value: IPosPrinterCharacterSetIdsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPosPrinterCharacterSetIdsStatics {
    public val __103913173_Ptr: Pointer?

    public val _103913173_VtblPtr: Pointer?
      get() = __103913173_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Utf16LE(): WinDef.UINT {
      val fnPtr = _103913173_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__103913173_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Ascii(): WinDef.UINT {
      val fnPtr = _103913173_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__103913173_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Ansi(): WinDef.UINT {
      val fnPtr = _103913173_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__103913173_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IPosPrinterCharacterSetIdsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __103913173_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPosPrinterCharacterSetIdsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5c709eff709a4fe7b21506a748a38b39")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPosPrinterCharacterSetIdsStatics(ptr: Pointer?): WithDefault =
        IPosPrinterCharacterSetIdsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPosPrinterCharacterSetIdsStatics {
      val address = segment.toRawLongValue()
      return makeIPosPrinterCharacterSetIdsStatics(Pointer(address))
    }

    public override fun toNative(obj: IPosPrinterCharacterSetIdsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__103913173_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPosPrinterCharacterSetIdsStatics):
        Array<IPosPrinterCharacterSetIdsStatics?> = (elements as
        Array<IPosPrinterCharacterSetIdsStatics?>).castToImpl<IPosPrinterCharacterSetIdsStatics,IPosPrinterCharacterSetIdsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPosPrinterCharacterSetIdsStatics?> =
        arrayOfNulls<IPosPrinterCharacterSetIdsStatics_Impl>(size) as
        Array<IPosPrinterCharacterSetIdsStatics?>
  }
}
