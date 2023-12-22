package Windows.Media.Core

import Windows.Media.Core.IMediaStreamSource.ABI.IID
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaStreamSource4.ABI::class)
@Signature("{1d0cfcab-830d-417c-a3a9-2454fd6415c7}")
@Guid("1d0cfcab830d417ca3a92454fd6415c7")
@WinRTInterface("1d0cfcab830d417ca3a92454fd6415c7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaStreamSource4.ByReference::class)
public interface IMediaStreamSource4 : NativeMapped, IWinRTInterface, IMediaStreamSource,
    IMediaSource {
  @InterfaceMethod(0)
  public fun put_IsLive(value: Boolean): Unit

  @InterfaceMethod(1)
  public fun get_IsLive(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaStreamSource4> {
    public override fun getValue() = ABI.makeIMediaStreamSource4(pointer.getPointer(0))

    public fun setValue(value: IMediaStreamSource4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaStreamSource4, IMediaStreamSource.WithDefault,
      IMediaSource.WithDefault {
    public val __2058342890_Ptr: Pointer?

    public val _2058342890_VtblPtr: Pointer?
      get() = __2058342890_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_IsLive(value: Boolean): Unit {
      val fnPtr = _2058342890_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2058342890_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_IsLive(): Boolean {
      val fnPtr = _2058342890_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2058342890_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IMediaStreamSource4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaStreamSource, IMediaSource
      {
    public override val __2144608138_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2058342890_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1076644650_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IMediaSource.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_2058342890_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2058342890_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaStreamSource4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1d0cfcab830d417ca3a92454fd6415c7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaStreamSource4(ptr: Pointer?): WithDefault = IMediaStreamSource4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaStreamSource4 {
      val address = segment.toRawLongValue()
      return makeIMediaStreamSource4(Pointer(address))
    }

    public override fun toNative(obj: IMediaStreamSource4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2058342890_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaStreamSource4): Array<IMediaStreamSource4?> =
        (elements as
        Array<IMediaStreamSource4?>).castToImpl<IMediaStreamSource4,IMediaStreamSource4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaStreamSource4?> =
        arrayOfNulls<IMediaStreamSource4_Impl>(size) as Array<IMediaStreamSource4?>
  }
}
