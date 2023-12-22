package Windows.Media.Protection.PlayReady

import Windows.Media.Protection.PlayReady.INDCustomDataFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Byte
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(NDCustomData.ABI::class)
@Signature("rc(Windows.Media.Protection.PlayReady.NDCustomData;{f5cb0fdc-2d09-4f19-b5e1-76a0b3ee9267})")
@WinRTByReference(brClass = NDCustomData.ByReference::class)
public class NDCustomData(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INDCustomData.WithDefault, IWinRTObject {
  private val __1245402091_Interface: INDCustomData.WithDefault by lazy {
    as_1245402091()
  }


  public override val __1245402091_Ptr: JNAPointer? by lazy {
    __1245402091_Interface.__1245402091_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1245402091_Interface)

  public constructor(customDataTypeIDBytes: Array<Byte>, customDataBytes: Array<Byte>) :
      this(ABI.activate(customDataTypeIDBytes, customDataBytes))

  private fun as_1245402091(): INDCustomData.WithDefault {
    if(pointer == NULL) {
      return(INDCustomData.ABI.makeINDCustomData(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INDCustomData>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INDCustomData.ABI.makeINDCustomData(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<NDCustomData> {
    public override fun getValue() = NDCustomData(pointer.getPointer(0))

    public fun setValue(value: NDCustomData): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NDCustomData, MemoryAddress> {
    public val INDCustomDataFactory_Instance: INDCustomDataFactory by lazy {
      createINDCustomDataFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createINDCustomDataFactory(): INDCustomDataFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Protection.PlayReady.NDCustomData".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(INDCustomDataFactory.ABI.makeINDCustomDataFactory(factoryActivatorPtr.value))
    }

    public fun activate(customDataTypeIDBytes: Array<Byte>, customDataBytes: Array<Byte>):
        JNAPointer? = INDCustomDataFactory_Instance.CreateInstance(customDataTypeIDBytes,
        customDataBytes)?.pointer

    public override fun fromNative(segment: MemoryAddress): NDCustomData {
      val address = segment.toRawLongValue()
      return NDCustomData(Pointer(address))
    }

    public override fun toNative(obj: NDCustomData): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
