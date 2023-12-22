package Windows.Media.Core

import Windows.Media.Core.IMediaCue.ABI.IID
import Windows.Storage.Streams.IBuffer
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

@ABIMarker(IDataCue.ABI::class)
@Signature("{7c7f676d-1fbc-4e2d-9a87-ee38bd1dc637}")
@Guid("7c7f676d1fbc4e2d9a87ee38bd1dc637")
@WinRTInterface("7c7f676d1fbc4e2d9a87ee38bd1dc637")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataCue.ByReference::class)
public interface IDataCue : NativeMapped, IWinRTInterface, IMediaCue {
  @InterfaceMethod(0)
  public fun put_Data(value: IBuffer?): Unit

  @InterfaceMethod(1)
  public fun get_Data(): IBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDataCue> {
    public override fun getValue() = ABI.makeIDataCue(pointer.getPointer(0))

    public fun setValue(value: IDataCue_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataCue, IMediaCue.WithDefault {
    public val __597704268_Ptr: Pointer?

    public val _597704268_VtblPtr: Pointer?
      get() = __597704268_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_Data(value: IBuffer?): Unit {
      val fnPtr = _597704268_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__597704268_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_Data(): IBuffer? {
      val fnPtr = _597704268_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__597704268_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }
  }

  public class IDataCue_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaCue {
    public override val __256643460_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_597704268_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __597704268_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataCue, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7c7f676d1fbc4e2d9a87ee38bd1dc637")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataCue(ptr: Pointer?): WithDefault = IDataCue_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataCue {
      val address = segment.toRawLongValue()
      return makeIDataCue(Pointer(address))
    }

    public override fun toNative(obj: IDataCue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__597704268_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataCue): Array<IDataCue?> = (elements as
        Array<IDataCue?>).castToImpl<IDataCue,IDataCue_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataCue?> = arrayOfNulls<IDataCue_Impl>(size) as
        Array<IDataCue?>
  }
}
