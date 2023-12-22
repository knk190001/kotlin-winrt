package Windows.Graphics.Holographic

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IHolographicFramePresentationMonitor.ABI::class)
@Signature("{ca87256c-6fae-428e-bb83-25dfee51136b}")
@Guid("ca87256c6fae428ebb8325dfee51136b")
@WinRTInterface("ca87256c6fae428ebb8325dfee51136b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicFramePresentationMonitor.ByReference::class)
public interface IHolographicFramePresentationMonitor : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun ReadReports(): IVectorView<HolographicFramePresentationReport?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicFramePresentationMonitor> {
    public override fun getValue() =
        ABI.makeIHolographicFramePresentationMonitor(pointer.getPointer(0))

    public fun setValue(value: IHolographicFramePresentationMonitor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicFramePresentationMonitor, IClosable.WithDefault {
    public val __2137106994_Ptr: Pointer?

    public val _2137106994_VtblPtr: Pointer?
      get() = __2137106994_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ReadReports(): IVectorView<HolographicFramePresentationReport?>? {
      val fnPtr = _2137106994_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<HolographicFramePresentationReport?>>()
      val hr = fn.invokeHR(arrayOf(__2137106994_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<HolographicFramePresentationReport?>>(result.getValue())
      return resultValue
    }
  }

  public class IHolographicFramePresentationMonitor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2137106994_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2137106994_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicFramePresentationMonitor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ca87256c6fae428ebb8325dfee51136b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicFramePresentationMonitor(ptr: Pointer?): WithDefault =
        IHolographicFramePresentationMonitor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicFramePresentationMonitor {
      val address = segment.toRawLongValue()
      return makeIHolographicFramePresentationMonitor(Pointer(address))
    }

    public override fun toNative(obj: IHolographicFramePresentationMonitor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2137106994_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicFramePresentationMonitor):
        Array<IHolographicFramePresentationMonitor?> = (elements as
        Array<IHolographicFramePresentationMonitor?>).castToImpl<IHolographicFramePresentationMonitor,IHolographicFramePresentationMonitor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicFramePresentationMonitor?> =
        arrayOfNulls<IHolographicFramePresentationMonitor_Impl>(size) as
        Array<IHolographicFramePresentationMonitor?>
  }
}
