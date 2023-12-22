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

@ABIMarker(IBarcodeScannerStatusUpdatedEventArgs.ABI::class)
@Signature("{355d8586-9c43-462b-a91a-816dc97f452c}")
@Guid("355d85869c43462ba91a816dc97f452c")
@WinRTInterface("355d85869c43462ba91a816dc97f452c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarcodeScannerStatusUpdatedEventArgs.ByReference::class)
public interface IBarcodeScannerStatusUpdatedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): BarcodeScannerStatus?

  @InterfaceMethod(1)
  public fun get_ExtendedStatus(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarcodeScannerStatusUpdatedEventArgs> {
    public override fun getValue() =
        ABI.makeIBarcodeScannerStatusUpdatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IBarcodeScannerStatusUpdatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarcodeScannerStatusUpdatedEventArgs {
    public val __328320309_Ptr: Pointer?

    public val _328320309_VtblPtr: Pointer?
      get() = __328320309_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): BarcodeScannerStatus? {
      val fnPtr = _328320309_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BarcodeScannerStatus>()
      val hr = fn.invokeHR(arrayOf(__328320309_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BarcodeScannerStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedStatus(): WinDef.UINT {
      val fnPtr = _328320309_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__328320309_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IBarcodeScannerStatusUpdatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __328320309_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarcodeScannerStatusUpdatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("355d85869c43462ba91a816dc97f452c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarcodeScannerStatusUpdatedEventArgs(ptr: Pointer?): WithDefault =
        IBarcodeScannerStatusUpdatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBarcodeScannerStatusUpdatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIBarcodeScannerStatusUpdatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IBarcodeScannerStatusUpdatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__328320309_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarcodeScannerStatusUpdatedEventArgs):
        Array<IBarcodeScannerStatusUpdatedEventArgs?> = (elements as
        Array<IBarcodeScannerStatusUpdatedEventArgs?>).castToImpl<IBarcodeScannerStatusUpdatedEventArgs,IBarcodeScannerStatusUpdatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBarcodeScannerStatusUpdatedEventArgs?> =
        arrayOfNulls<IBarcodeScannerStatusUpdatedEventArgs_Impl>(size) as
        Array<IBarcodeScannerStatusUpdatedEventArgs?>
  }
}
