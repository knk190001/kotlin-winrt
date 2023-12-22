package Windows.Media.Core

import Windows.Foundation.Collections.PropertySet
import Windows.Media.Core.IDataCue.ABI.IID
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

@ABIMarker(IDataCue2.ABI::class)
@Signature("{bc561b15-95f2-49e8-96f1-8dd5dac68d93}")
@Guid("bc561b1595f249e896f18dd5dac68d93")
@WinRTInterface("bc561b1595f249e896f18dd5dac68d93")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataCue2.ByReference::class)
public interface IDataCue2 : NativeMapped, IWinRTInterface, IDataCue, IMediaCue {
  @InterfaceMethod(0)
  public fun get_Properties(): PropertySet?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDataCue2> {
    public override fun getValue() = ABI.makeIDataCue2(pointer.getPointer(0))

    public fun setValue(value: IDataCue2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataCue2, IDataCue.WithDefault, IMediaCue.WithDefault {
    public val __1348963074_Ptr: Pointer?

    public val _1348963074_VtblPtr: Pointer?
      get() = __1348963074_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Properties(): PropertySet? {
      val fnPtr = _1348963074_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PropertySet>()
      val hr = fn.invokeHR(arrayOf(__1348963074_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PropertySet>(result.getValue())
      return resultValue
    }
  }

  public class IDataCue2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IDataCue, IMediaCue {
    public override val __597704268_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1348963074_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __256643460_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IMediaCue.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1348963074_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1348963074_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataCue2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bc561b1595f249e896f18dd5dac68d93")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataCue2(ptr: Pointer?): WithDefault = IDataCue2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataCue2 {
      val address = segment.toRawLongValue()
      return makeIDataCue2(Pointer(address))
    }

    public override fun toNative(obj: IDataCue2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1348963074_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataCue2): Array<IDataCue2?> = (elements as
        Array<IDataCue2?>).castToImpl<IDataCue2,IDataCue2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataCue2?> = arrayOfNulls<IDataCue2_Impl>(size)
        as Array<IDataCue2?>
  }
}
