package Windows.UI.Core

import Windows.System.DispatcherQueue
import Windows.UI.Core.ICorePointerInputSource.ABI.IID
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

@ABIMarker(ICorePointerInputSource2.ABI::class)
@Signature("{d703708a-4516-4786-b1e5-2751d563f997}")
@Guid("d703708a45164786b1e52751d563f997")
@WinRTInterface("d703708a45164786b1e52751d563f997")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICorePointerInputSource2.ByReference::class)
public interface ICorePointerInputSource2 : NativeMapped, IWinRTInterface, ICorePointerInputSource {
  @InterfaceMethod(0)
  public fun get_DispatcherQueue(): DispatcherQueue?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICorePointerInputSource2> {
    public override fun getValue() = ABI.makeICorePointerInputSource2(pointer.getPointer(0))

    public fun setValue(value: ICorePointerInputSource2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICorePointerInputSource2, ICorePointerInputSource.WithDefault {
    public val __1954378448_Ptr: Pointer?

    public val _1954378448_VtblPtr: Pointer?
      get() = __1954378448_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DispatcherQueue(): DispatcherQueue? {
      val fnPtr = _1954378448_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DispatcherQueue>()
      val hr = fn.invokeHR(arrayOf(__1954378448_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DispatcherQueue>(result.getValue())
      return resultValue
    }
  }

  public class ICorePointerInputSource2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ICorePointerInputSource {
    public override val __1725612450_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1954378448_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1954378448_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICorePointerInputSource2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d703708a45164786b1e52751d563f997")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICorePointerInputSource2(ptr: Pointer?): WithDefault =
        ICorePointerInputSource2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICorePointerInputSource2 {
      val address = segment.toRawLongValue()
      return makeICorePointerInputSource2(Pointer(address))
    }

    public override fun toNative(obj: ICorePointerInputSource2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1954378448_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICorePointerInputSource2):
        Array<ICorePointerInputSource2?> = (elements as
        Array<ICorePointerInputSource2?>).castToImpl<ICorePointerInputSource2,ICorePointerInputSource2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICorePointerInputSource2?> =
        arrayOfNulls<ICorePointerInputSource2_Impl>(size) as Array<ICorePointerInputSource2?>
  }
}
