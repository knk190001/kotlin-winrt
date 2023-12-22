package Windows.UI.Input.Spatial

import Windows.UI.Input.Spatial.ISpatialInteractionDetectedEventArgs.ABI.IID
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

@ABIMarker(ISpatialInteractionDetectedEventArgs2.ABI::class)
@Signature("{7b263e93-5f13-419c-97d5-834678266aa6}")
@Guid("7b263e935f13419c97d5834678266aa6")
@WinRTInterface("7b263e935f13419c97d5834678266aa6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialInteractionDetectedEventArgs2.ByReference::class)
public interface ISpatialInteractionDetectedEventArgs2 : NativeMapped, IWinRTInterface,
    ISpatialInteractionDetectedEventArgs {
  @InterfaceMethod(0)
  public fun get_InteractionSource(): SpatialInteractionSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialInteractionDetectedEventArgs2> {
    public override fun getValue() =
        ABI.makeISpatialInteractionDetectedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: ISpatialInteractionDetectedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialInteractionDetectedEventArgs2,
      ISpatialInteractionDetectedEventArgs.WithDefault {
    public val __1027146051_Ptr: Pointer?

    public val _1027146051_VtblPtr: Pointer?
      get() = __1027146051_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InteractionSource(): SpatialInteractionSource? {
      val fnPtr = _1027146051_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialInteractionSource>()
      val hr = fn.invokeHR(arrayOf(__1027146051_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialInteractionSource>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialInteractionDetectedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface,
      ISpatialInteractionDetectedEventArgs {
    public override val __1141512399_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1027146051_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1027146051_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialInteractionDetectedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7b263e935f13419c97d5834678266aa6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialInteractionDetectedEventArgs2(ptr: Pointer?): WithDefault =
        ISpatialInteractionDetectedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialInteractionDetectedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeISpatialInteractionDetectedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: ISpatialInteractionDetectedEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1027146051_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialInteractionDetectedEventArgs2):
        Array<ISpatialInteractionDetectedEventArgs2?> = (elements as
        Array<ISpatialInteractionDetectedEventArgs2?>).castToImpl<ISpatialInteractionDetectedEventArgs2,ISpatialInteractionDetectedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialInteractionDetectedEventArgs2?> =
        arrayOfNulls<ISpatialInteractionDetectedEventArgs2_Impl>(size) as
        Array<ISpatialInteractionDetectedEventArgs2?>
  }
}
