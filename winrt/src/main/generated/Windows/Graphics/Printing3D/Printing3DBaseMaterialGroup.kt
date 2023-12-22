package Windows.Graphics.Printing3D

import Windows.Graphics.Printing3D.IPrinting3DBaseMaterialGroupFactory.ABI.IID
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(Printing3DBaseMaterialGroup.ABI::class)
@Signature("rc(Windows.Graphics.Printing3D.Printing3DBaseMaterialGroup;{94f070b8-2515-4a8d-a1f0-d0fc13d06021})")
@WinRTByReference(brClass = Printing3DBaseMaterialGroup.ByReference::class)
public class Printing3DBaseMaterialGroup(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrinting3DBaseMaterialGroup.WithDefault, IWinRTObject {
  private val __2016934122_Interface: IPrinting3DBaseMaterialGroup.WithDefault by lazy {
    as_2016934122()
  }


  public override val __2016934122_Ptr: JNAPointer? by lazy {
    __2016934122_Interface.__2016934122_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2016934122_Interface)

  public constructor(MaterialGroupId: WinDef.UINT) : this(ABI.activate(MaterialGroupId))

  private fun as_2016934122(): IPrinting3DBaseMaterialGroup.WithDefault {
    if(pointer == NULL) {
      return(IPrinting3DBaseMaterialGroup.ABI.makeIPrinting3DBaseMaterialGroup(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrinting3DBaseMaterialGroup>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrinting3DBaseMaterialGroup.ABI.makeIPrinting3DBaseMaterialGroup(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<Printing3DBaseMaterialGroup> {
    public override fun getValue() = Printing3DBaseMaterialGroup(pointer.getPointer(0))

    public fun setValue(value: Printing3DBaseMaterialGroup): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Printing3DBaseMaterialGroup, MemoryAddress> {
    public val IPrinting3DBaseMaterialGroupFactory_Instance: IPrinting3DBaseMaterialGroupFactory by
        lazy {
      createIPrinting3DBaseMaterialGroupFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPrinting3DBaseMaterialGroupFactory(): IPrinting3DBaseMaterialGroupFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Printing3D.Printing3DBaseMaterialGroup".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPrinting3DBaseMaterialGroupFactory.ABI.makeIPrinting3DBaseMaterialGroupFactory(factoryActivatorPtr.value))
    }

    public fun activate(MaterialGroupId: WinDef.UINT): JNAPointer? =
        IPrinting3DBaseMaterialGroupFactory_Instance.Create(MaterialGroupId)?.pointer

    public override fun fromNative(segment: MemoryAddress): Printing3DBaseMaterialGroup {
      val address = segment.toRawLongValue()
      return Printing3DBaseMaterialGroup(Pointer(address))
    }

    public override fun toNative(obj: Printing3DBaseMaterialGroup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
