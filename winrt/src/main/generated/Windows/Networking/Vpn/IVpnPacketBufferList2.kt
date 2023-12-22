package Windows.Networking.Vpn

import Windows.Foundation.Collections.IIterable
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.DynamicSignature
import com.github.knk190001.winrtbinding.runtime.annotations.GenericType
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.TypeHash
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
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
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.KTypeProjection
import kotlin.reflect.KVariance.INVARIANT
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@GenericType
@DynamicSignature
@ABIMarker(IVpnPacketBufferList2.ABI::class)
@Guid("3e7acfe5ea1e482a8d98c065f57d89ea")
@WinRTByReference(IVpnPacketBufferList2.ByReference::class)
@TypeHash("__666747868_Type")
public interface IVpnPacketBufferList2 : NativeMapped, IWinRTInterface, IIterable<VpnPacketBuffer?>
    {
  public val __666747868_Ptr: Pointer?

  public val _666747868_VtblPtr: Pointer?
    get() = __666747868_Ptr?.getPointer(0)

  public override val __1449643190_Type: KType
    get() = IIterable::class.createType(listOf(
      KTypeProjection(INVARIANT,VpnPacketBuffer::class.createType()),
    ))

  public fun AddLeadingPacket(nextVpnPacketBuffer: VpnPacketBuffer?): Unit

  public fun RemoveLeadingPacket(): VpnPacketBuffer?

  public fun AddTrailingPacket(nextVpnPacketBuffer: VpnPacketBuffer?): Unit

  public fun RemoveTrailingPacket(): VpnPacketBuffer?

  public interface WithDefault : IVpnPacketBufferList2 {
    public override fun AddLeadingPacket(nextVpnPacketBuffer: VpnPacketBuffer?): Unit {
      val fnPtr = _666747868_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val hr = fn.invokeHR(arrayOf(__666747868_Ptr,marshalToNative(nextVpnPacketBuffer)))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    public override fun RemoveLeadingPacket(): VpnPacketBuffer? {
      val fnPtr = _666747868_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<VpnPacketBuffer>()
      val hr = fn.invokeHR(arrayOf(__666747868_Ptr,result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = VpnPacketBuffer::class.createType()
      return marshalFromNative<VpnPacketBuffer>(result.getValue(), returnType!!)
    }

    public override fun AddTrailingPacket(nextVpnPacketBuffer: VpnPacketBuffer?): Unit {
      val fnPtr = _666747868_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val hr = fn.invokeHR(arrayOf(__666747868_Ptr,marshalToNative(nextVpnPacketBuffer)))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    public override fun RemoveTrailingPacket(): VpnPacketBuffer? {
      val fnPtr = _666747868_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<VpnPacketBuffer>()
      val hr = fn.invokeHR(arrayOf(__666747868_Ptr,result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = VpnPacketBuffer::class.createType()
      return marshalFromNative<VpnPacketBuffer>(result.getValue(), returnType!!)
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnPacketBufferList2> {
    public override fun getValue(): IVpnPacketBufferList2 =
        ABI.makeIVpnPacketBufferList2(pointer.getPointer(0))

    public fun setValue(value: IVpnPacketBufferList2): Unit {
      pointer = value.__666747868_Ptr!!
    }
  }

  public class IVpnPacketBufferList2Impl(
    ptr: JNAPointer? = NULL
  ) : PointerType(ptr), WithDefault {
    public override val __666747868_Ptr: JNAPointer?
      get() = pointer

    public override val _666747868_VtblPtr: JNAPointer?
      get() = pointer.getPointer(0)

    public override val __1449643190_Ptr: JNAPointer? by lazy { 
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(guidOf<IIterable<VpnPacketBuffer?>>())
      val result = PointerByReference()
      IUnknownVtbl(_666747868_VtblPtr).queryInterface(pointer, refiid, result)
      result.value
    }


    public companion object {
      public operator fun invoke(ptr: JNAPointer?): IVpnPacketBufferList2 =
          IVpnPacketBufferList2Impl(ptr)
    }
  }

  public object ABI : IABI<IVpnPacketBufferList2, MemoryAddress> {
    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnPacketBufferList2(ptr: JNAPointer?) = IVpnPacketBufferList2Impl( ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnPacketBufferList2 {
      val address = segment.toRawLongValue()
      return makeIVpnPacketBufferList2(Pointer(address))
    }

    public override fun toNative(obj: IVpnPacketBufferList2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__666747868_Ptr))
  }
}
