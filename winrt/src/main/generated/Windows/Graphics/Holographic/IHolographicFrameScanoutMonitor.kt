package Windows.Graphics.Holographic

import Windows.Foundation.Collections.IVector
import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IHolographicFrameScanoutMonitor.ABI::class)
@Signature("{7e83efa9-843c-5401-8095-9bc1b8b08638}")
@Guid("7e83efa9843c540180959bc1b8b08638")
@WinRTInterface("7e83efa9843c540180959bc1b8b08638")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicFrameScanoutMonitor.ByReference::class)
public interface IHolographicFrameScanoutMonitor : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun ReadReports(): IVector<HolographicFrameScanoutReport?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicFrameScanoutMonitor> {
    public override fun getValue() = ABI.makeIHolographicFrameScanoutMonitor(pointer.getPointer(0))

    public fun setValue(value: IHolographicFrameScanoutMonitor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicFrameScanoutMonitor, IClosable.WithDefault {
    public val __1064021317_Ptr: Pointer?

    public val _1064021317_VtblPtr: Pointer?
      get() = __1064021317_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ReadReports(): IVector<HolographicFrameScanoutReport?>? {
      val fnPtr = _1064021317_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<HolographicFrameScanoutReport?>>()
      val hr = fn.invokeHR(arrayOf(__1064021317_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVector<HolographicFrameScanoutReport?>>(result.getValue())
      return resultValue
    }
  }

  public class IHolographicFrameScanoutMonitor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1064021317_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1064021317_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicFrameScanoutMonitor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7e83efa9843c540180959bc1b8b08638")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicFrameScanoutMonitor(ptr: Pointer?): WithDefault =
        IHolographicFrameScanoutMonitor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicFrameScanoutMonitor {
      val address = segment.toRawLongValue()
      return makeIHolographicFrameScanoutMonitor(Pointer(address))
    }

    public override fun toNative(obj: IHolographicFrameScanoutMonitor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1064021317_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicFrameScanoutMonitor):
        Array<IHolographicFrameScanoutMonitor?> = (elements as
        Array<IHolographicFrameScanoutMonitor?>).castToImpl<IHolographicFrameScanoutMonitor,IHolographicFrameScanoutMonitor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicFrameScanoutMonitor?> =
        arrayOfNulls<IHolographicFrameScanoutMonitor_Impl>(size) as
        Array<IHolographicFrameScanoutMonitor?>
  }
}
